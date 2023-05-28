package com.gmail.fluorize009.basicgui.gui;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public interface Gui {
    Inventory getInventory();

    void click(InventoryClickEvent event);
}