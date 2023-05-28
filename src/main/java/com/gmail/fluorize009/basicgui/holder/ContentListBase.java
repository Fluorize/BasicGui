package com.gmail.fluorize009.basicgui.holder;

import com.gmail.fluorize009.basicgui.content.ItemProxy;
import com.gmail.fluorize009.basicgui.content.SingleVisibleItem;
import com.gmail.fluorize009.basicgui.content.GuiItem;

import java.util.List;

public class ContentListBase implements ContentList {

    private int scroll = 0;
    private final List<SingleVisibleItem> items;

    private final List<ItemProxy> proxies;

    public ContentListBase(List<SingleVisibleItem> items, List<ItemProxy> proxies) {
        this.items = items;
        this.proxies = proxies;
    }

    @Override
    public GuiItem getEmptyContent() {
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

    @Override
    public List<ItemProxy> getProxies() {
        return proxies;
    }
}
