package com.gmail.fluorize009.basicgui.content.button;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WarpButton extends GuiButton{

    private final Location destination;

    public WarpButton(ItemStack icon,Location destination) {
        super(icon);
        this.destination = destination;
    }


    @Override
    public boolean perform(Player performer) {
        return performer.teleport(destination);
    }

    @Override
    public boolean isCloseTrigger() {
        //Memo: teleportすると自動的にインベントリを閉じる模様
        return false;
    }
}
