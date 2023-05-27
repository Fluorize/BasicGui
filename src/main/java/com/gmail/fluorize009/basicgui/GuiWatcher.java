package com.gmail.fluorize009.basicgui;

import com.gmail.fluorize009.basicgui.gui.Gui;

import java.util.HashSet;
import java.util.Set;

public class GuiWatcher {
    private final Set<Gui> guis = new HashSet<>();

    public Set<Gui> getGuis(){
        return guis;
    }
}
