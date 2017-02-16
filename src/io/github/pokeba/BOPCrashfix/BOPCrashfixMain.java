package io.github.pokeba.BOPCrashfix;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.pokeba.BOPCrashfix.BOPCrashfixSub;

public class BOPCrashfixMain extends JavaPlugin implements Listener
{


	@Override
	public void onEnable() //on Plugin enable
	{
		getServer().getPluginManager().registerEvents(new BOPCrashfixSub(this), this);
	 	Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
		
	public void onDisable() //On Plugin disable
	{
		Bukkit.getLogger().info("has been disabled");
	}
}
