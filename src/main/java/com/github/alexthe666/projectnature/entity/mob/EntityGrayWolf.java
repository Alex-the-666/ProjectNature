package com.github.alexthe666.projectnature.entity.mob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIActivity;
import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIAttack;
import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIMoving;
import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIResponse;
import com.github.alexthe666.projectnature.entity.EntityProjectNatureMob;

public class EntityGrayWolf extends EntityProjectNatureMob{

	public EntityGrayWolf(World worldIn) {
		super(worldIn);
		this.setSize(1.2F, 0.9F);
		shadowMultiplier = 0.7F;
	}

	@Override
	public String getTexture() {
		switch(this.getSubtype()){
		default:
			return "pn:textures/models/graywolf/graywolf_wild_0.png";
		case 1:
			return "pn:textures/models/graywolf/graywolf_wild_1.png";
		case 2:
			return "pn:textures/models/graywolf/graywolf_wild_2.png";
		case 3:
			return "pn:textures/models/graywolf/graywolf_wild_3.png";
		case 4:
			return "pn:textures/models/graywolf/graywolf_wild_4.png";
		case 5:
			return "pn:textures/models/graywolf/graywolf_wild_5.png";
		}
	}

	@Override
	public AnimalAIMoving movingType() {

		return AnimalAIMoving.TERESTIAL;
	}

	@Override
	public AnimalAIAttack attackType() {

		return AnimalAIAttack.SHAKE;
	}

	@Override
	public AnimalAIActivity activityType() {

		return AnimalAIActivity.BOTH;
	}

	@Override
	public AnimalAIResponse responseType() {

		return AnimalAIResponse.TERRATIRIAL;
	}

	@Override
	public boolean canBeTamed(ItemStack stackObj, EntityPlayer player) {

		return false;
	}

	@Override
	public int maxSubtypes() {

		return 5;
	}

	@Override
	public float maxSize() {

		return 0.9F;
	}

	@Override
	public float minSize() {

		return 1.0F;
	}

	@Override
	public int adultAge() {

		return 8;
	}

	@Override
	public void onSpawn() {
		this.setSubtype(this.rand.nextInt(6));
		this.setGender(this.getRNG().nextInt(2));
		this.setAnimalAge(this.adultAge());
	}

	@Override
	public float femaleSizeDifference() {

		return 0.9F;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {

		return new EntityGrayWolf(worldObj);
	}

}
