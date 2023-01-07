
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campoorosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.campoorosmod.world.features.ores.CaloriteOreFeature;
import net.mcreator.campoorosmod.CampoorosModMod;

@Mod.EventBusSubscriber
public class CampoorosModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CampoorosModMod.MODID);
	public static final RegistryObject<Feature<?>> CALORITE_ORE = REGISTRY.register("calorite_ore", CaloriteOreFeature::feature);
}
