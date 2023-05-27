package com.gmail.fluorize009.basicgui;

import com.gmail.fluorize009.basicgui.listeners.GuiEventListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.Set;

public final class BasicGui extends JavaPlugin {




    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GuiEventListener(this),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }





}
