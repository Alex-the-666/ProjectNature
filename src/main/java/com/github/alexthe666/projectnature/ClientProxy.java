package com.github.alexthe666.projectnature;

import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.github.alexthe666.projectnature.client.model.ModelGrayWolf;
import com.github.alexthe666.projectnature.client.model.ModelPNRabbit;
import com.github.alexthe666.projectnature.client.model.ModelRedDeer;
import com.github.alexthe666.projectnature.client.model.ModelRedFox;
import com.github.alexthe666.projectnature.client.model.ModelWildBoar;
import com.github.alexthe666.projectnature.client.render.entity.RenderProjectNatureMob;
import com.github.alexthe666.projectnature.core.ModBlocks;
import com.github.alexthe666.projectnature.core.ModItems;
import com.github.alexthe666.projectnature.entity.mob.EntityGrayWolf;
import com.github.alexthe666.projectnature.entity.mob.EntityPNRabbit;
import com.github.alexthe666.projectnature.entity.mob.EntityRedDeer;
import com.github.alexthe666.projectnature.entity.mob.EntityRedFox;
import com.github.alexthe666.projectnature.entity.mob.EntityWildBoar;

public class ClientProxy extends CommonProxy{

	public void render(){
		renderBlocks();
		renderItems();
		renderEntites();
	}
	public void renderBlocks(){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.leafLitter), 0, new ModelResourceLocation("pn:leaflitter", "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.campfireoff), 0, new ModelResourceLocation("pn:campfireoff", "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.campfireon), 0, new ModelResourceLocation("pn:campfireon", "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.pitfall), 0, new ModelResourceLocation("pn:pitfall", "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.minilog), 0, new ModelResourceLocation("pn:minilog", "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.snareon), 0, new ModelResourceLocation("pn:snareon", "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.snareoff), 0, new ModelResourceLocation("pn:snareoff", "inventory"));

	}
	
	public void renderItems(){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		renderItem.getItemModelMesher().register(ModItems.leaf, 0, new ModelResourceLocation("pn:leaf", "inventory"));
	}

	public void renderEntites(){
		RenderingRegistry.registerEntityRenderingHandler(EntityRedDeer.class, new RenderProjectNatureMob(Minecraft.getMinecraft().getRenderManager(), new ModelRedDeer()));
		RenderingRegistry.registerEntityRenderingHandler(EntityPNRabbit.class, new RenderProjectNatureMob(Minecraft.getMinecraft().getRenderManager(), new ModelPNRabbit()));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrayWolf.class, new RenderProjectNatureMob(Minecraft.getMinecraft().getRenderManager(), new ModelGrayWolf()));
		RenderingRegistry.registerEntityRenderingHandler(EntityRedFox.class, new RenderProjectNatureMob(Minecraft.getMinecraft().getRenderManager(), new ModelRedFox()));
		RenderingRegistry.registerEntityRenderingHandler(EntityWildBoar.class, new RenderProjectNatureMob(Minecraft.getMinecraft().getRenderManager(), new ModelWildBoar()));

	}
}
