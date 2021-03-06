package com.github.alexthe666.projectnature.client.render.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.github.alexthe666.projectnature.entity.EntityProjectNatureMob;

public class RenderProjectNatureMob extends RenderLiving {

	public RenderProjectNatureMob(RenderManager renderManager, ModelBase model) {
		super(renderManager, model, 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		if(entity instanceof EntityProjectNatureMob){
			return new ResourceLocation(((EntityProjectNatureMob)entity).getTexture());
		}
		return null;
	}

	protected void preRenderCallback(EntityLivingBase entity, float f)
	{
		if(entity instanceof EntityProjectNatureMob){
			EntityProjectNatureMob mob = (EntityProjectNatureMob)entity;
			this.shadowSize = mob.getAnimalSize() * mob.shadowMultiplier;
			GL11.glScalef(mob.getAnimalSize(), mob.getAnimalSize(), mob.getAnimalSize());
			if(mob.getGender() == 0){
				GL11.glScalef(mob.femaleSizeDifference(), mob.femaleSizeDifference(), mob.femaleSizeDifference());
			}
		}
	}
}
