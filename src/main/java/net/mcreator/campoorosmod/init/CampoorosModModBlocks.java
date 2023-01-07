
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campoorosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.campoorosmod.block.FireshaleBlock;
import net.mcreator.campoorosmod.block.CampoorosPortalBlock;
import net.mcreator.campoorosmod.block.CaloriteOreBlock;
import net.mcreator.campoorosmod.CampoorosModMod;

public class CampoorosModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CampoorosModMod.MODID);
	public static final RegistryObject<Block> CAMPOOROS_PORTAL = REGISTRY.register("campooros_portal", () -> new CampoorosPortalBlock());
	public static final RegistryObject<Block> FIRESHALE = REGISTRY.register("fireshale", () -> new FireshaleBlock());
	public static final RegistryObject<Block> CALORITE_ORE = REGISTRY.register("calorite_ore", () -> new CaloriteOreBlock());
}
