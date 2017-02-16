package io.github.pokeba.BOPCrashfix;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import io.github.pokeba.BOPCrashfix.BOPCrashfixMain;

public class EventListener implements Listener
{
	BOPCrashfixMain plugin;
	public EventListener(BOPCrashfixMain instance)
	{
		plugin = instance;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e)
	{		
    	if (e.getAction() == Action.RIGHT_CLICK_BLOCK)
    	{
    		Block blockClicked = e.getClickedBlock();
    		if(blockClicked.getTypeId() == 1316 && blockClicked.getData() == (byte)  7) //Coke oven typeID is 1316, durability should be 7
    		{
    			if(e.getPlayer().getItemInHand().getTypeId() == 4836) //All buckets share  the ID 4836
    			{
    				e.getPlayer().sendMessage(ChatColor.RED+"Please do not use Biomes'O'Plenty liquid on coke ovens!");
    				e.setCancelled(true);
    			}
    		}
    	}
	}
}
