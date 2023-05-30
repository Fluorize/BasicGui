package com.gmail.fluorize009.basicgui.content.proxy;

import com.gmail.fluorize009.basicgui.content.GuiContent;

public interface ItemProxy extends GuiContent {

    static GuiContent getBodyOf(GuiContent content){
        GuiContent c = content;
        while(c instanceof ItemProxy){
            c = ((ItemProxy) c).getContent();
        }
        return c;
    }

    void setContent(GuiContent content);

    GuiContent getContent();

}
