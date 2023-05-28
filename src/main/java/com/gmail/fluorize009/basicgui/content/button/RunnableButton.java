package com.gmail.fluorize009.basicgui.content.button;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class RunnableButton extends GuiButton{

    List<Runnable> runnable;

    public RunnableButton(ItemStack icon, List<Runnable> runnable) {
        super(icon);
        this.runnable = runnable;
    }

    @Override
    public boolean perform(Player performer) {
        try {
            for (Runnable r : runnable) {
                r.run();
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
