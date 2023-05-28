package com.gmail.fluorize009.basicgui.holder;

import com.gmail.fluorize009.basicgui.content.ItemProxy;
import com.gmail.fluorize009.basicgui.content.SingleVisibleItem;
import com.gmail.fluorize009.basicgui.content.GuiItem;

import java.util.List;

public interface ContentHolder {
    GuiItem getEmptyContent();

    List<SingleVisibleItem> getContents();

    SingleVisibleItem getContentAtSlot(int index);

    List<ItemProxy> getProxies();

}
