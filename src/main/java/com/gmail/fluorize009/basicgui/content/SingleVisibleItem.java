package com.gmail.fluorize009.basicgui.content;

import org.bukkit.inventory.ItemStack;

/**
 * アイテムです
 * ボタンだったり、フレームだったり...
 */
public abstract class SingleVisibleItem implements GuiContent, GuiItem {

    private final ItemStack icon;

    public SingleVisibleItem(ItemStack icon){
        this.icon = icon;
    }

    @Override
    public ItemStack getIcon() {
        return icon;
    }
}
