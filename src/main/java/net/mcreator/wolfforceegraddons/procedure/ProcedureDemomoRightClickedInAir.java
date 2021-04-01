package net.mcreator.wolfforceegraddons.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.wolfforceegraddons.ElementsWOLFforceIgniteaddons;

@ElementsWOLFforceIgniteaddons.ModElement.Tag
public class ProcedureDemomoRightClickedInAir extends ElementsWOLFforceIgniteaddons.ModElement {
	public ProcedureDemomoRightClickedInAir(ElementsWOLFforceIgniteaddons instance) {
		super(instance, 21);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DemomoRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure DemomoRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 18000);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperienceLevel((int) 5);
	}
}
