package com.gmail.fluorize009.basicgui.gui;

public interface HubGui extends Gui{
    void setDestination(int slot,Gui gui);
    Gui getDestination(int slot);
}
