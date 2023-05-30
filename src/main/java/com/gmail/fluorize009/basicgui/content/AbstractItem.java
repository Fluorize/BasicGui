package com.gmail.fluorize009.basicgui.content;

import org.bukkit.inventory.ItemStack;

/**
 * アイテムです
 * ボタンだったり、フレームだったり...
 */
public abstract class AbstractItem implements GuiItem {

    private final ItemStack icon;

    public AbstractItem(ItemStack icon){
        this.icon = icon;
    }

    @Override
    public ItemStack getIcon() {
        return icon;
    }
}
