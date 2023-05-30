package com.gmail.fluorize009.basicgui.holder;

import com.gmail.fluorize009.basicgui.content.GuiContent;
import com.gmail.fluorize009.basicgui.content.proxy.ItemProxy;
import com.gmail.fluorize009.basicgui.content.GuiItem;

import java.util.List;

public class ContentListBase implements ContentList {

    private int scroll = 0;
    private final List<? extends GuiContent> items;

    private final List<? extends ItemProxy> proxies;

    public ContentListBase(List<? extends GuiContent> items, List<? extends ItemProxy> proxies) {
        this.items = items;
        this.proxies = proxies;
        update();
    }

    @Override
    public GuiItem getEmptyContent() {
        return null;
    }

    @Override
    public List<? extends GuiContent> getContents() {
        return items;
    }

    @Override
    public int scrollTo(int index) {
        scroll = index;
        if(scroll >= items.size() - proxies.size()){
            scroll = items.size() - proxies.size();
        } else if(scroll <= 0){
            scroll = 0;
        }
        update();
        return scroll;
    }

    @Override
    public boolean goNext() {
        if(scroll >= items.size() - proxies.size()){
            return false;
        }
        scroll++;
        update();
        return true;
    }

    @Override
    public boolean goBack() {
        if(scroll <= 0){
            return false;
        }
        scroll--;
        update();
        return true;
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
    public GuiContent getContentAt(int slot) {
        return ItemProxy.getBodyOf(proxies.get(slot));
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
