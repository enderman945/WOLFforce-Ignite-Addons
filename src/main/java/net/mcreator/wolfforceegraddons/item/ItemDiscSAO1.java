
package net.mcreator.wolfforceegraddons.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.wolfforceegraddons.creativetab.TabWFcreativetab;
import net.mcreator.wolfforceegraddons.ElementsWOLFforceIgniteaddons;

@ElementsWOLFforceIgniteaddons.ModElement.Tag
public class ItemDiscSAO1 extends ElementsWOLFforceIgniteaddons.ModElement {
	@GameRegistry.ObjectHolder("wolfforceigniteaddons:discsao1")
	public static final Item block = null;
	public ItemDiscSAO1(ElementsWOLFforceIgniteaddons instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("wolfforceigniteaddons:discsao1", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("discsao1", ElementsWOLFforceIgniteaddons.sounds.get(new ResourceLocation("wolfforceigniteaddons:op1_sao")));
			setUnlocalizedName("discsao1");
			setRegistryName("discsao1");
			setCreativeTab(TabWFcreativetab.tab);
		}
	}
}
