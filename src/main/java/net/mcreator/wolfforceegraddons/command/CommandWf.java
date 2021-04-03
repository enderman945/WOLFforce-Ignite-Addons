
package net.mcreator.wolfforceegraddons.command;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.ICommand;
import net.minecraft.command.CommandHandler;

import net.mcreator.wolfforceegraddons.ElementsWOLFforceIgniteaddons;

import java.util.List;
import java.util.ArrayList;

@ElementsWOLFforceIgniteaddons.ModElement.Tag
public class CommandWf extends ElementsWOLFforceIgniteaddons.ModElement {
	public CommandWf(ElementsWOLFforceIgniteaddons instance) {
		super(instance, 22);
	}

	@Override
	public void serverLoad(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandHandler());
	}
	public static class CommandHandler implements ICommand {
		@Override
		public int compareTo(ICommand c) {
			return getName().compareTo(c.getName());
		}

		@Override
		public boolean checkPermission(MinecraftServer server, ICommandSender var1) {
			return true;
		}

		@Override
		public List getAliases() {
			return new ArrayList();
		}

		@Override
		public List getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) {
			return new ArrayList();
		}

		@Override
		public boolean isUsernameIndex(String[] string, int index) {
			return true;
		}

		@Override
		public String getName() {
			return "wf";
		}

		@Override
		public String getUsage(ICommandSender var1) {
			return "/wf [<arguments>]";
		}

		@Override
		public void execute(MinecraftServer server, ICommandSender sender, String[] cmd) {
		}
	}
}
