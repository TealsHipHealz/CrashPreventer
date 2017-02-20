package io.github.pokeba.CrashPreventer;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
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
    		
    		if((blockClicked.getTypeId() == 1316 && blockClicked.getData() == (byte)  7) && e.getPlayer().getItemInHand().getTypeId() == 4836 )
    		{
    				e.getPlayer().sendMessage(ChatColor.RED+"Please do not use Biomes'O'Plenty liquids on coke ovens!");
    				e.setCancelled(true);
    		}
    	}
	}

	@EventHandler
	@SuppressWarnings("deprecation")
	public boolean onInventoryClick(InventoryClickEvent e)
	{
		Player p = (Player) e.getWhoClicked();
		if(p.getTargetBlock(null, 50).getTypeId() == 2540) //Need railcraft residual heat set to false in block.cfg -> B:residual.heat=false
														  // can be bypassed by using trough grass
		{
			if(e.getCurrentItem().getTypeId() == 444)
			{
				p.sendMessage(ChatColor.RED+"Please do not put ME Chests in Drawbridges!");
				e.setCancelled(true);
			}
		}
		return false;
	}
	
}

