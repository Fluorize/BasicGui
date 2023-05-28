package com.gmail.fluorize009.basicgui.content.button;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandButton extends GuiButton{
    private final String command;

    public CommandButton(ItemStack icon,String command) {
        super(icon);
        this.command = command;
    }

    @Override
    public boolean perform(Player performer) {
        return performer.performCommand(command);
    }

    @Override
    public boolean isCloseTrigger() {
        return true;
    }
}
