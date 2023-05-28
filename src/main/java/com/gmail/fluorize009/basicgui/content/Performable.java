package com.gmail.fluorize009.basicgui.content;

import org.bukkit.entity.Player;

public interface Performable extends GuiItem{
    /**
     * Run some task registered.
     * Called when the content is clicked.
     * @param performer clicker
     * @return true if it went well,otherwise false.
     */
    boolean perform(Player performer);


    /**
     *
     * @return true if it is needed to close GUI after clicked
     */
    boolean isCloseTrigger();
}
