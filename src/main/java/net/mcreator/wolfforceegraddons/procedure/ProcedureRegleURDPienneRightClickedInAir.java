package net.mcreator.wolfforceegraddons.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.wolfforceegraddons.ElementsWOLFforceIgniteaddons;

@ElementsWOLFforceIgniteaddons.ModElement.Tag
public class ProcedureRegleURDPienneRightClickedInAir extends ElementsWOLFforceIgniteaddons.ModElement {
	public ProcedureRegleURDPienneRightClickedInAir(ElementsWOLFforceIgniteaddons instance) {
		super(instance, 21);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RegleURDPienneRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure RegleURDPienneRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
			entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
				@Override
				public String getName() {
					return "";
				}

				@Override
				public boolean canUseCommand(int permission, String command) {
					return true;
				}

				@Override
				public World getEntityWorld() {
					return entity.world;
				}

				@Override
				public MinecraftServer getServer() {
					return entity.world.getMinecraftServer();
				}

				@Override
				public boolean sendCommandFeedback() {
					return false;
				}

				@Override
				public BlockPos getPosition() {
					return entity.getPosition();
				}

				@Override
				public Vec3d getPositionVector() {
					return new Vec3d(entity.posX, entity.posY, entity.posZ);
				}

				@Override
				public Entity getCommandSenderEntity() {
					return entity;
				}
			}, "spawn");
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 12000);
	}
}
