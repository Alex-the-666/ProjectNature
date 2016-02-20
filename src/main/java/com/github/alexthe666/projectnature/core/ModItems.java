package com.github.alexthe666.projectnature.core;

import net.minecraft.item.Item;

import com.github.alexthe666.projectnature.ProjectNature;
import com.github.alexthe666.projectnature.item.ItemGeneric;
import com.github.alexthe666.projectnature.item.ItemPNSpawnEgg;

public class ModItems{

	public static ItemPNSpawnEgg spawnegg;
	public static Item leaf;
	
	public static void init(){
		spawnegg = new ItemPNSpawnEgg(ProjectNature.tab_spawnEggs);
		leaf = new ItemGeneric("leaf").setUnlocalizedName("pn.leaf");
	}
}
