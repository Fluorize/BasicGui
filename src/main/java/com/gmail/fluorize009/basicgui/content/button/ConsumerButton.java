package com.gmail.fluorize009.basicgui.content.button;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Consumer;

import java.util.List;

public class ConsumerButton extends GuiButton{

    List<Consumer<Player>> consumers;

    public ConsumerButton(ItemStack icon, List<Consumer<Player>> consumers) {
        super(icon);
        this.consumers = consumers;
    }

    @Override
    public boolean perform(Player performer) {
        try {
            for (Consumer<Player> c : consumers) {
                c.accept(performer);
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean isCloseTrigger() {
        return false;
    }
}
