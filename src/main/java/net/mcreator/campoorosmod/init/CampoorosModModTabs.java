
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campoorosmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CampoorosModModTabs {
	public static CreativeModeTab TAB_CAMPOOROS_TAB;

	public static void load() {
		TAB_CAMPOOROS_TAB = new CreativeModeTab("tabcampooros_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CampoorosModModBlocks.FIRESHALE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
