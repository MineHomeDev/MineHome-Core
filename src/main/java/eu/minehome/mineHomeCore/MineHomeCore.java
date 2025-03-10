package eu.minehome.mineHomeCore;

import eu.minehome.mineHomeCore.listener.JoinEvent;
import eu.minehome.mineHomeCore.listener.QuitEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class MineHomeCore extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new JoinEvent(),this);
        Bukkit.getPluginManager().registerEvents(new QuitEvent(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
