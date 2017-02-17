package io.github.pokeba.CrashPreventer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.pokeba.CrashPreventer.CrashPreventerMain;

public class Commands implements CommandExecutor
{
	CrashPreventerMain plugin;
	public Commands(CrashPreventerMain instance)
	{
		plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if(cmd.getName().equalsIgnoreCase("crashpreventer")) //When player does /spawnmob
		{
			Player player = (Player) sender; 
			if (args.length == 0 || args[0] == "help") //If no argument at all or first argument is help
			{
				player.sendMessage(ChatColor.BLUE + "            [Poke's Crash preventer]");
				player.sendMessage(ChatColor.YELLOW+" -----------------------------------------------");
				player.sendMessage(ChatColor.YELLOW+"*"+ChatColor.RED+"Prevents player from crashing the server "+ChatColor.YELLOW+"*");
				player.sendMessage(ChatColor.YELLOW+" -----------------------------------------------");
			}
		}
		return false;
	}
}