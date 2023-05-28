package com.gmail.fluorize009.basicgui.content.scrollable;

import com.gmail.fluorize009.basicgui.content.MultiSlotContent;
import com.gmail.fluorize009.basicgui.content.SingleVisibleItem;

import java.util.List;

public class VerticalScrollableHolder extends ScrollableBase implements MultiSlotContent {

    private int slotLength;

    public VerticalScrollableHolder(List<SingleVisibleItem> items,int slotLength) {
        super(items);
        this.slotLength = slotLength;
    }





    @Override
    public int getSizeX() {
        return 1;
    }

    @Override
    public int getSizeY() {
        return slotLength;
    }
}
