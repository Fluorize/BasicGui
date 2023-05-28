package com.gmail.fluorize009.basicgui.holder;

public interface ContentList extends ContentHolder{
    void scrollTo(int index);
    void goNext();
    void goBack();

    int getScroll();
}
