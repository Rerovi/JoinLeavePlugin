package me.rerovi.joinleaveplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RED + " Heeft de server verlaten.");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if(player.hasPlayedBefore()) {
            player.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + " Welkom terug op de server!");
            e.setJoinMessage(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + " Is de server gejoined!");
        } else {
            e.setJoinMessage(ChatColor.GREEN + "Welkom " + ChatColor.DARK_PURPLE + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + " Op de server! Kijk gerust rond!");
        }

    }
}
