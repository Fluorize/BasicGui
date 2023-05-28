package com.gmail.fluorize009.basicgui.content;

public class ProxyContent implements ItemProxy {

    private GuiItem content;

    public ProxyContent(){
    }


    @Override
    public void setContent(GuiItem content) {
        this.content = content;
    }

    @Override
    public GuiItem getContent() {
        return content;
    }
}
