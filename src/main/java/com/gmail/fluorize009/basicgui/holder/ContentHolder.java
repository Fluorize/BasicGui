package com.gmail.fluorize009.basicgui.holder;

import com.gmail.fluorize009.basicgui.content.GuiContent;
import com.gmail.fluorize009.basicgui.content.proxy.ItemProxy;
import com.gmail.fluorize009.basicgui.content.GuiItem;

import java.util.List;

public interface ContentHolder {
    GuiItem getEmptyContent();

    List<? extends GuiContent> getContents();

    ItemProxy getProxyAt(int index);

    List<? extends ItemProxy> getProxies();

    GuiContent getContentAt(int slot);

    void update();
}
