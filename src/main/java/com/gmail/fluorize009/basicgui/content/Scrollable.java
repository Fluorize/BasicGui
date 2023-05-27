package com.gmail.fluorize009.basicgui.content;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Scrollable{
    ItemStack getEmptyIcon();
    void scrollTo(int index);
    void goNext();
    void goBack();
    List<SingleSlotContent> getContents();
    void setContent(SingleSlotContent content);

}
