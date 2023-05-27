package com.gmail.fluorize009.basicgui.content;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public abstract class ScrollableContentsHolder implements MultiSlotContent,Scrollable {
    @Override
    public ItemStack getEmptyIcon() {
        return null;
    }

    @Override
    public void scrollTo(int index) {

    }

    @Override
    public void goNext() {

    }

    @Override
    public void goBack() {

    }

    @Override
    public List<SingleSlotContent> getContents() {
        return null;
    }

    @Override
    public void setContent(SingleSlotContent content) {

    }
}
