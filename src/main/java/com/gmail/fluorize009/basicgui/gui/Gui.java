package com.gmail.fluorize009.basicgui.gui;

import com.gmail.fluorize009.basicgui.content.GuiContent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public interface Gui {
    Inventory getInventory();

    void click(InventoryClickEvent event);

    void setContentAt(int slot, GuiContent content);

    GuiContent getContentAt(int slot);

    void update();
}