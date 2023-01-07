
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campoorosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.campoorosmod.item.AdamantItem;
import net.mcreator.campoorosmod.CampoorosModMod;

public class CampoorosModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CampoorosModMod.MODID);
	public static final RegistryObject<Item> ADAMANT = REGISTRY.register("adamant", () -> new AdamantItem());
}
