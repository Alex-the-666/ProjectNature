package com.github.alexthe666.projectnature.core;

import java.util.Random;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.github.alexthe666.projectnature.ProjectNature;
import com.github.alexthe666.projectnature.entity.mob.EntityGrayWolf;
import com.github.alexthe666.projectnature.entity.mob.EntityPNRabbit;
import com.github.alexthe666.projectnature.entity.mob.EntityRedDeer;
import com.github.alexthe666.projectnature.entity.mob.EntityRedFox;
import com.github.alexthe666.projectnature.entity.mob.EntityWildBoar;

public class ModEntities{

	public static void init(){
		registerSpawnable(EntityRedDeer.class, "pn.reddeer", 0X593817, 0X795C3D);
		registerSpawnable(EntityPNRabbit.class, "pn.rabbit", 0X5B422F, 0XA19D99);
		registerSpawnable(EntityGrayWolf.class, "pn.graywolf", 0X6C6868, 0XD7D6D5);
		registerSpawnable(EntityRedFox.class, "pn.redfox", 0XAB613D, 0XCCCBCA);
		registerSpawnable(EntityWildBoar.class, "pn.wildboar", 0X413329, 0XABA495);

	}
	
	public static void registerSpawnable(Class entityClass, String name, int mainColor, int subColor){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId, mainColor, subColor);
		EntityRegistry.registerModEntity(entityClass, name, entityId, ProjectNature.instance, 64, 1, true);
	}
	
	public static void registerUnspawnable(Class entityClass, String name){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.registerModEntity(entityClass, name, entityId, ProjectNature.instance, 64, 1, true);

	}
	
}
