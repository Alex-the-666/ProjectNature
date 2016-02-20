package com.github.alexthe666.projectnature.entity;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIOcelotAttack;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIActivity;
import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIAttack;
import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIMoving;
import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIResponse;
import com.github.alexthe666.projectnature.api.EnumOrder;
import com.github.alexthe666.projectnature.entity.ai.AnimalAIAge;
import com.github.alexthe666.projectnature.entity.ai.AnimalAIDefend;
import com.github.alexthe666.projectnature.entity.ai.AnimalAIFollow;
import com.github.alexthe666.projectnature.entity.ai.AnimalAIStarve;
import com.github.alexthe666.projectnature.entity.ai.AnimalAITarget;
import com.github.alexthe666.projectnature.entity.ai.AnimalAIWander;

public abstract class EntityProjectNatureMob extends EntityTameable{

	public float herdMemberRange = 32;
	public List<EntityProjectNatureMob> flock = new ArrayList<EntityProjectNatureMob>();
	public EntityProjectNatureMob flockLeader = null;
	protected boolean developsResistance;
	protected boolean breaksBlocks;
	public boolean isFlying;
	public BlockPos currentTarget;
	public EnumOrder currentOrder;
	public float shadowMultiplier;
	
	public EntityProjectNatureMob(World worldIn) {
		super(worldIn);
		this.currentOrder = EnumOrder.WANDER;
		this.tasks.addTask(0, new AnimalAIAge(this));
		this.tasks.addTask(0, new AnimalAIStarve(this));
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(3, new AnimalAITarget(this));
        this.tasks.addTask(4, new AnimalAIFollow(this, 10, 2));
        this.tasks.addTask(4, new AnimalAIWander(this));
        this.tasks.addTask(4, new AnimalAIDefend(this));

		this.setHunger(50);
		this.setHealth(10F);
	}
	
	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(18, 0);
		this.dataWatcher.addObject(19, 0);
		this.dataWatcher.addObject(20, 0);
		this.dataWatcher.addObject(21, 0);
		this.dataWatcher.addObject(22, 0);
		this.dataWatcher.addObject(23, 30);
		this.dataWatcher.addObject(24, 300);
		this.dataWatcher.addObject(25, 0);

	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("Hunger", this.getHunger());
		compound.setInteger("HungerTick", this.getHungerTick());
		compound.setInteger("AnimalAge", this.getAnimalAge());
		compound.setInteger("AgeTick", this.getAnimalAgeTick());
		compound.setInteger("SubType", this.getSubtype());
		compound.setByte("currentOrder", (byte) this.currentOrder.ordinal());
		compound.setInteger("Gender", this.getGender());
		compound.setInteger("Sleeping", this.dataWatcher.getWatchableObjectInt(20));
		compound.setInteger("Carcass", this.dataWatcher.getWatchableObjectInt(22));

	}

	public void readEntityFromNBT(NBTTagCompound compound)
	{
		super.readEntityFromNBT(compound);
		this.setAnimalAge(compound.getInteger("AnimalAge"));
		this.setAnimalAgeTick(compound.getInteger("AgeTick"));
		this.setHunger(compound.getInteger("Hunger"));
		this.setHungerTick(compound.getInteger("HungerTick"));
		this.setSubtype(compound.getInteger("SubType"));
		this.setGender(compound.getInteger("Gender"));
		currentOrder = EnumOrder.values()[compound.getByte("currentOrder")];
		//Sleeping
		this.dataWatcher.updateObject(20, compound.getInteger("Sleeping"));
		//Carcass
		this.dataWatcher.updateObject(22, compound.getInteger("Carcass"));

	}
	public abstract String getTexture();
	
	public abstract AnimalAIMoving movingType();
	
	public abstract AnimalAIAttack attackType();

	public abstract AnimalAIActivity activityType();

	public abstract AnimalAIResponse responseType();
	
	public abstract boolean canBeTamed(ItemStack stackObj, EntityPlayer player);

	public abstract int maxSubtypes();
	
	public abstract float maxSize();

	public abstract float minSize();
	
	public abstract int adultAge();
	
	public abstract void onSpawn();
	
	public abstract float femaleSizeDifference();

	public void updateSize(){
		jump();
	}
	
	public boolean interact(EntityPlayer player)
	{

		ItemStack item = player.inventory.getCurrentItem();
		if(player.isSneaking()){

			this.currentOrder = this.currentOrder.next();
			if (this.currentOrder == EnumOrder.SIT)
			{
				this.getNavigator().clearPathEntity();
				this.setSitting(true);
			}
			else
			{
				this.setSitting(false);

			}
			return true;
		}
		return false;
	}
	
	public float getAnimalSize()
	{
		float step;
		step = (maxSize() - minSize()) / (125);

		if (getAnimalAge() > adultAge())
		{
			return minSize() + (step * 125);
		}

		return minSize() + (step * getAnimalAge());
	}

	public boolean increaseAnimalAge()
	{
		if (getAnimalAge() < 124)
		{
			setAnimalAge(getAnimalAge() + 1);
			return true;
		}

		return false;
	}
	
	@Override
	public void setScaleForAge(boolean par1)
	{
		setScale(getAnimalSize());
	}
	
	public void increaseAnimalAgeTick()
	{
		setAnimalAgeTick(getAnimalAgeTick() + 1);
	}
	
	public int getAnimalAge()
	{
		return this.dataWatcher.getWatchableObjectInt(18);
	}

	public void setAnimalAge(int i)
	{
		this.dataWatcher.updateObject(18, i);
	}

	public int getAnimalAgeTick()
	{
		return this.dataWatcher.getWatchableObjectInt(19);
	}

	public void setAnimalAgeTick(int i)
	{
		this.dataWatcher.updateObject(19, i);
	}
	
	public boolean isSleeping(){
		if(this.dataWatcher.getWatchableObjectInt(20) == 0){
			return false;
		}else{
			return true;
		}
	}
	
	public void setSleeping(boolean isSleeping){
		if(isSleeping){
			this.dataWatcher.updateObject(20, 1);
		}else{
			this.dataWatcher.updateObject(20, 0);
		}
	}
	
	public int getSubtype()
	{
		return this.dataWatcher.getWatchableObjectInt(21);
	}

	public void setSubtype(int i)
	{
		this.dataWatcher.updateObject(21, i);
	}
	
	public boolean isCarcass(){
		if(this.dataWatcher.getWatchableObjectInt(22) == 0){
			return false;
		}else{
			return true;
		}
	}
	
	public void setCarcass(boolean isCarcass){
		if(isCarcass){
			this.dataWatcher.updateObject(22, 1);
		}else{
			this.dataWatcher.updateObject(22, 0);
		}
	}
	
	public int getHunger()
	{
		return this.dataWatcher.getWatchableObjectInt(23);
	}
	
	public void setHunger(int i)
	{
		this.dataWatcher.updateObject(23, i);
	}
	
	public int getHungerTick()
	{
		return this.dataWatcher.getWatchableObjectInt(24);
	}
	
	public void setHungerTick(int i)
	{
		this.dataWatcher.updateObject(24, i);
	}
	
	public int getGender()
	{
		return this.dataWatcher.getWatchableObjectInt(25);
	}
	
	public void setGender(int i)
	{
		this.dataWatcher.updateObject(25, i);
	}
	
	public EntityLivingBase closestEntity(){
		return (EntityLivingBase)this.worldObj.findNearestEntityWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().expand((double)16, 3.0D, 16), this);
	}
	
	public boolean isSitting()
	{
		return currentOrder == EnumOrder.SIT;
	}
	
	public boolean increaseHunger(int var1)
	{
		if (this.getHunger() >= 100)
		{
			return false;
		}

		this.setHunger(this.getHunger() + var1);

		if (this.getHunger() > 100)
		{
			this.setHunger(100);
		}

		this.worldObj.playSoundAtEntity(this, "random.eat",
				this.getSoundVolume(), this.getSoundPitch());
		return true;
	}
	
	public void decreaseHunger()
	{
		if (this.getHunger() > 0)
		{
			this.setHunger(this.getHunger() - 1);
		}
	}
	
	public void decreaseHungerTick()
	{
		if (this.getHungerTick() > 0)
		{
			this.setHungerTick(this.getHungerTick() - 1);
		}
	}
	
	public boolean isChild()
	{
		return getAnimalAge() > adultAge();
	}
	
	public boolean isAdult(){
		return getAnimalAge() <= adultAge();
	}
	
	@Override
	protected boolean canDespawn()
	{
		return false;
	}
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData data)
	{
		this.onSpawn();
		return super.onInitialSpawn(difficulty, data);
	}

	public boolean isHungry() {
		return isDeadlyHungry() ? false : this.getHunger() >= 50;
	}
	
	private boolean isDeadlyHungry() {
		return this.getHunger() >= 15;
	}
	
}
