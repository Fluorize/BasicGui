package com.gmail.fluorize009.basicgui.holder;

public interface ContentList extends ContentHolder{
    int scrollTo(int index);
    boolean goNext();
    boolean goBack();

    int getScroll();
}
