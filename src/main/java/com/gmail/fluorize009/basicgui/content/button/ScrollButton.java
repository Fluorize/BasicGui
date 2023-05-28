package com.gmail.fluorize009.basicgui.content.button;

import com.gmail.fluorize009.basicgui.holder.ContentList;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ScrollButton extends GuiButton{

    private final ContentList target;

    public ScrollButton(ItemStack icon, ContentList target) {
        super(icon);
        this.target = target;
    }


    @Override
    public boolean perform(Player performer) {
        target.goNext();
        return false;
    }

    @Override
    public boolean isCloseTrigger() {
        return false;
    }
}
