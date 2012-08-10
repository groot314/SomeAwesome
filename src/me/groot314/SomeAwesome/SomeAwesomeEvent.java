package me.groot314.SomeAwesome;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SomeAwesomeEvent implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerLogin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		if (player.hasPlayedBefore()){
			Bukkit.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "[Server] Welcome back " + player.getDisplayName());
		} 
		else{
			Bukkit.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "[Server] Welcome " + player.getDisplayName() + " to SomeAwesomeMC.Com");
		}
	}
}
