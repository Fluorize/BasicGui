package com.gmail.fluorize009.basicgui.content;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface ContentHolder {
    ItemStack getEmptyIcon();

    List<SingleVisibleItem> getContents();

    SingleVisibleItem getContentAtSlot(int index);
}
