package io.github.pokeba.CrashPreventer;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class CrashPreventerMain extends JavaPlugin implements Listener
{
	@Override
	public void onEnable() //on Plugin enable
	{
		getServer().getPluginManager().registerEvents(new EventListener(this), this);
		this.getCommand("crashpreventer").setExecutor(new Commands(this));
		//getConfig().options().copyDefaults(true);
        //saveDefaultConfig(); //to call it: plugin.getConfig().getString("bob")
	 	Bukkit.getLogger().info("has been enabled");
	}
		
	public void onDisable() //On Plugin disable
	{
		Bukkit.getLogger().info("has been disabled");
	}
}
