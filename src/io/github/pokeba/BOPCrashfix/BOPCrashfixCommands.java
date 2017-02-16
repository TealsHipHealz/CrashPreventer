package io.github.pokeba.BOPCrashfix;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.pokeba.BOPCrashfix.BOPCrashfixMain;

public class BOPCrashfixCommands implements CommandExecutor
{
	private BOPCrashfixMain main;
	public BOPCrashfixCommands(BOPCrashfixMain BOPCrashfix)
	{
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if(cmd.getName().equalsIgnoreCase("BOPCrashfix")) //When player does /spawnmob
		{
			Player player = (Player) sender; 
			if (args.length == 0 || args[0] == "help") //If no argument at all or first argument is help
			{
				player.sendMessage(ChatColor.BLUE + "            [Poke's BOPCrashFix]");
				player.sendMessage(ChatColor.YELLOW+" ----------------------------");
				player.sendMessage(ChatColor.YELLOW+"*"+ChatColor.RED+"Prevents player from using BOP liquids on coke oven"+ChatColor.YELLOW+"*");
				player.sendMessage(ChatColor.YELLOW+" ----------------------------");
			}
		}
		return false;
	}
}

