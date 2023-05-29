package com.gmail.fluorize009.basicgui.holder;

import com.gmail.fluorize009.basicgui.content.ItemProxy;
import com.gmail.fluorize009.basicgui.content.SingleVisibleItem;
import com.gmail.fluorize009.basicgui.content.GuiItem;

import java.util.List;

public class ContentListBase implements ContentList {

    private int scroll = 0;
    private final List<? extends GuiItem> items;

    private final List<? extends ItemProxy> proxies;

    public ContentListBase(List<? extends GuiItem> items, List<? extends ItemProxy> proxies) {
        this.items = items;
        this.proxies = proxies;
    }

    @Override
    public GuiItem getEmptyContent() {
        return null;
    }

    @Override
    public List<? extends GuiItem> getContents() {
        return items;
    }

    @Override
    public void scrollTo(int index) {
        scroll = index;
        update();
    }

    @Override
    public void goNext() {
        scroll++;
        update();
    }

    @Override
    public void goBack() {
        scroll--;
        update();
    }

    @Override
    public int getScroll() {
        return scroll;
    }

    @Override
    public ItemProxy getProxyAt(int slot) {
        return proxies.get(slot);
    }

    @Override
    public GuiItem getContentAt(int slot) {
        return proxies.get(slot).getContent();
    }

    @Override
    public List<? extends ItemProxy> getProxies() {
        return proxies;
    }

    @Override
    public void update(){
        for(int i=0;i<proxies.size();i++){
            proxies.get(i).setContent(items.get(scroll+i));
        }
    }
}
