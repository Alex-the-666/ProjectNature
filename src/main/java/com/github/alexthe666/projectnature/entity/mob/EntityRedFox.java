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

public class EntityRedFox extends EntityProjectNatureMob{

	public EntityRedFox(World worldIn) {
		super(worldIn);
		this.setSize(1.2F, 0.9F);
		shadowMultiplier = 0.55F;
	}

	@Override
	public String getTexture() {
		return "pn:textures/models/redfox/redfox_wild_0.png";
	}

	@Override
	public AnimalAIMoving movingType() {
		return AnimalAIMoving.TERESTIAL;
	}

	@Override
	public AnimalAIAttack attackType() {

		return AnimalAIAttack.BITE;
	}

	@Override
	public AnimalAIActivity activityType() {

		return AnimalAIActivity.NOCTURNAL;
	}

	@Override
	public AnimalAIResponse responseType() {

		return AnimalAIResponse.AFRAID;
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
		return 0.7F;
	}

	@Override
	public float minSize() {
		return 0.8F;
	}

	@Override
	public int adultAge() {
		return 8;
	}

	@Override
	public void onSpawn() {
		this.setGender(this.getRNG().nextInt(2));
		this.setAnimalAge(this.adultAge());
	}

	@Override
	public float femaleSizeDifference() {

		return 0.9F;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {

		return new EntityRedFox(worldObj);
	}

}
