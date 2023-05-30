package com.gmail.fluorize009.basicgui.content;

public class ProxyContent implements ItemProxy {

    private GuiContent content;

    public ProxyContent(){
    }

    public ProxyContent(GuiContent defaultContent){
        content = defaultContent;
    }

    @Override
    public void setContent(GuiContent content) {
        this.content = content;
    }

    @Override
    public GuiContent getContent() {
        return content;
    }
}
