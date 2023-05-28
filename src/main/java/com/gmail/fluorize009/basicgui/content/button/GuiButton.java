package com.gmail.fluorize009.basicgui.content.button;

import com.gmail.fluorize009.basicgui.content.*;
import org.bukkit.inventory.ItemStack;

public abstract class GuiButton extends SingleVisibleItem implements Performable {

    private ItemStack icon;

    public GuiButton(ItemStack icon) {
        super(icon);
    }

    @Override
    public ItemStack getIcon() {
        return null;
    }



}
