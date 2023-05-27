package com.gmail.fluorize009.basicgui.listeners;

import com.gmail.fluorize009.basicgui.BasicGui;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;

public final class GuiEventListener implements Listener {

    BasicGui plugin;

    public GuiEventListener(BasicGui basicGui) {
        plugin = basicGui;
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){

    }

    @EventHandler
    public void onClose(InventoryCloseEvent event){

    }
}
