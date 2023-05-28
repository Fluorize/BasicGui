package com.gmail.fluorize009.basicgui.content;

import org.bukkit.inventory.ItemStack;

/**
 * ひとつのスロットに存在する、見えるアイテムです
 * ボタンだったり、フレームだったり...
 */
public class SingleVisibleItem implements Visible,SingleSlotContent{

    private final ItemStack icon;

    public SingleVisibleItem(ItemStack icon){
        this.icon = icon;
    }

    @Override
    public ItemStack getIcon() {
        return icon;
    }
}
