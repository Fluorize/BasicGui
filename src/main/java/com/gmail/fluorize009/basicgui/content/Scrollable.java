package com.gmail.fluorize009.basicgui.content;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Scrollable extends ContentHolder{
    void scrollTo(int index);
    void goNext();
    void goBack();

    int getScroll();
}
