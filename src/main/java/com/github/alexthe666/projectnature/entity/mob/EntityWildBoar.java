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

public class EntityWildBoar extends EntityProjectNatureMob{

	public EntityWildBoar(World worldIn) {
		super(worldIn);
		this.setSize(1.1F, 0.9F);
		shadowMultiplier = 0.5F;
	}

	@Override
	public String getTexture() {

		return "pn:textures/models/wildboar/wildboar_0.png";
	}

	@Override
	public AnimalAIMoving movingType() {

		return AnimalAIMoving.TERESTIAL;
	}

	@Override
	public AnimalAIAttack attackType() {

		return AnimalAIAttack.CHARGE;
	}

	@Override
	public AnimalAIActivity activityType() {

		return AnimalAIActivity.DURINAL;
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
		return 0;
	}

	@Override
	public float maxSize() {
		return 1.1F;
	}

	@Override
	public float minSize() {

		return 1.1F;
	}

	@Override
	public int adultAge() {
		return 7;
	}

	@Override
	public void onSpawn() {
		this.setGender(this.getRNG().nextInt(2));
		this.setAnimalAge(this.adultAge());
	}

	@Override
	public float femaleSizeDifference() {
		return 1;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityWildBoar(worldObj);
	}

}
