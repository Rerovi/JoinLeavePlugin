package me.rerovi.joinleaveplugin;

import me.rerovi.joinleaveplugin.listeners.JoinLeaveListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        System.out.println("JoinLeave has started");
    }

    @Override
    public void onDisable() {
        System.out.println("JoinLeave has stopped");
    }
}
