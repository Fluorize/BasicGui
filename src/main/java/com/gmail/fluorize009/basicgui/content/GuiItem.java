package com.gmail.fluorize009.basicgui.content;

import org.bukkit.inventory.ItemStack;

public interface GuiItem extends GuiContent {
    /**
     * The item which will be shown the player on GUI
     * @return item on the GUI
     */
    ItemStack getIcon();

}
