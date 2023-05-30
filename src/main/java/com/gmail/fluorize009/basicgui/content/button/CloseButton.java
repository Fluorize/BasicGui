package com.gmail.fluorize009.basicgui.content.button;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CloseButton extends GuiButton{
    public CloseButton(ItemStack icon) {
        super(icon);
    }

    @Override
    public boolean perform(Player performer) {
        return true;
    }

    @Override
    public boolean isCloseTrigger() {
        return true;
    }
}
