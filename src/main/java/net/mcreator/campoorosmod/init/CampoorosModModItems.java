
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campoorosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.campoorosmod.item.CampoorosItem;
import net.mcreator.campoorosmod.item.AdamantItem;
import net.mcreator.campoorosmod.CampoorosModMod;

public class CampoorosModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CampoorosModMod.MODID);
	public static final RegistryObject<Item> ADAMANT = REGISTRY.register("adamant", () -> new AdamantItem());
	public static final RegistryObject<Item> CAMPOOROS = REGISTRY.register("campooros", () -> new CampoorosItem());
	public static final RegistryObject<Item> FIRESHALE = block(CampoorosModModBlocks.FIRESHALE, CampoorosModModTabs.TAB_CAMPOOROS_TAB);
	public static final RegistryObject<Item> CALORITE_ORE = block(CampoorosModModBlocks.CALORITE_ORE, CampoorosModModTabs.TAB_CAMPOOROS_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
