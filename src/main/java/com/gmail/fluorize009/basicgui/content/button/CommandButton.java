package com.gmail.fluorize009.basicgui.content.button;

import com.gmail.fluorize009.basicgui.content.Performable;
import org.bukkit.entity.Player;

public class CommandButton extends GuiButton implements Performable {
    private String command;

    @Override
    public boolean perform(Player performer) {
        return performer.performCommand(command);
    }

    @Override
    public boolean isCloseTrigger() {
        return true;
    }
}
