package com.gmail.fluorize009.basicgui.content;

import org.bukkit.inventory.ItemStack;

public interface SingleSlotContent extends GuiContent{

    /**
     * The item which will be showed the player on GUI
     * @return item on the GUI
     */
    ItemStack getIcon();
}
