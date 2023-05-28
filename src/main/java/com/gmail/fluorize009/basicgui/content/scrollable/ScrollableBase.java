package com.gmail.fluorize009.basicgui.content.scrollable;

import com.gmail.fluorize009.basicgui.content.Scrollable;
import com.gmail.fluorize009.basicgui.content.SingleVisibleItem;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public abstract class ScrollableBase implements Scrollable {

    private int scroll = 0;
    private final List<SingleVisibleItem> items;

    public ScrollableBase(List<SingleVisibleItem> items) {
        this.items = items;
    }

    @Override
    public ItemStack getEmptyIcon() {
        return null;
    }

    @Override
    public List<SingleVisibleItem> getContents() {
        return items;
    }

    @Override
    public void scrollTo(int index) {
        scroll = index;
    }

    @Override
    public void goNext() {
        scroll++;
    }

    @Override
    public void goBack() {
        scroll--;
    }

    @Override
    public int getScroll() {
        return scroll;
    }

    @Override
    public SingleVisibleItem getContentAtSlot(int slot) {
        return items.get(slot-scroll);
    }


}
