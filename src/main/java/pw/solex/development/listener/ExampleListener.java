package pw.solex.development.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ExampleListener implements Listener {

    // This is a basic Join & Leave Event
    // These two events will broadcast the following messages on line 20 and 27 when a player joins the server.

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        Bukkit.broadcastMessage(ChatColor.AQUA + player.getName() + ChatColor.GOLD + " has joined the server.");
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        Bukkit.broadcastMessage(ChatColor.AQUA + player.getName() + ChatColor.GOLD + " has left the server.");
    }
}
