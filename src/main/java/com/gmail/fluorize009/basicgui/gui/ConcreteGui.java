package com.gmail.fluorize009.basicgui.gui;

import com.gmail.fluorize009.basicgui.holder.ContentHolder;
import com.gmail.fluorize009.basicgui.content.GuiContent;
import com.gmail.fluorize009.basicgui.content.Performable;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class ConcreteGui implements Gui{

    List<GuiContent> contents = new ArrayList<>();
    Inventory inventory;


    public ConcreteGui(Inventory inventory){

    }

    @Override
    public Inventory getInventory() {
        return null;
    }

    @Override
    public void click(InventoryClickEvent event) {
        GuiContent c = contents.get(event.getSlot());
        if(c instanceof ContentHolder){
            ContentHolder ch = ((ContentHolder) c);
        }
        if (c instanceof Performable) {
            Performable pf = (Performable) c;
            pf.perform((Player) event.getWhoClicked());
            if (pf.isCloseTrigger()) {
                //close
            }
        }
        update();
        event.setCancelled(true);
    }

    @Override
    public void setContentAt(int slot, GuiContent content) {
        contents.set(slot,content);
    }

    @Override
    public GuiContent getContentAt(int slot) {
        return contents.get(slot);
    }

    @Override
    public void update() {

    }
}
