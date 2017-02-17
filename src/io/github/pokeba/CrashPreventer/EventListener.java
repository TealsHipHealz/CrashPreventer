package io.github.pokeba.CrashPreventer;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventListener implements Listener
{
	CrashPreventerMain plugin;
	public EventListener(CrashPreventerMain instance)
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
    		if((blockClicked.getTypeId() == 1316 && blockClicked.getData() == (byte)  7) || (blockClicked.getTypeId() == 2540 && (blockClicked.getData() >= (byte)  0 || blockClicked.getData() <= (byte) 3 ))) //CokeOven = 1316:7 Drawbridge = 2540:0-3
    		{
    			if(e.getPlayer().getItemInHand().getTypeId() == 4836 || e.getPlayer().getItemInHand().getTypeId() == 444) //BOP = 4836, ME Chest = 444
    			{
    				e.getPlayer().sendMessage(ChatColor.RED+"Please do not use Biomes'O'Plenty liquid on coke ovens!");
    				e.setCancelled(true);
    			}
    		}
    	}
	}

}

