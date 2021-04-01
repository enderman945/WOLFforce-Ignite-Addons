
package net.mcreator.wolfforceegraddons.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.wolfforceegraddons.item.ItemWflogo;
import net.mcreator.wolfforceegraddons.ElementsWOLFforceIgniteaddons;

@ElementsWOLFforceIgniteaddons.ModElement.Tag
public class TabWFcreativetab extends ElementsWOLFforceIgniteaddons.ModElement {
	public TabWFcreativetab(ElementsWOLFforceIgniteaddons instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabwfcreativetab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemWflogo.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
