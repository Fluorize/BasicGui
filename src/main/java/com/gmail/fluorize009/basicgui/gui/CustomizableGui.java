package com.gmail.fluorize009.basicgui.gui;

import com.gmail.fluorize009.basicgui.content.GuiItem;
import com.gmail.fluorize009.basicgui.content.proxy.ItemProxy;
import com.gmail.fluorize009.basicgui.content.GuiContent;
import com.gmail.fluorize009.basicgui.content.Performable;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class CustomizableGui implements Gui{

    List<GuiContent> contents = new ArrayList<>();
    Inventory inventory;


    public CustomizableGui(Inventory inventory){
        this.inventory = inventory;
    }

    public CustomizableGui(Inventory inventory, List<GuiContent> contents){
        this.inventory = inventory;
        this.contents = contents;
        update();
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public void click(InventoryClickEvent event) {
        event.setCancelled(true);
        GuiContent c = ItemProxy.getBodyOf(contents.get(event.getSlot()));
        if (c instanceof Performable) {
            Performable pf = (Performable) c;
            if (pf.perform((Player) event.getWhoClicked()) && pf.isCloseTrigger()) {
                //close
                event.getWhoClicked().closeInventory(InventoryCloseEvent.Reason.PLUGIN);
            }
        }
        update();
    }


    @Override
    public void setContentAt(int slot, GuiContent content) {
        contents.set(slot,content);
        update();
    }

    @Override
    public GuiContent getContentAt(int slot) {
        return contents.get(slot);
    }

    @Override
    public boolean unregisteredOnClose() {
        return true;
    }

    @Override
    public void update() {
        for(int i=0;i<contents.size();i++) {
            GuiContent c = ItemProxy.getBodyOf(contents.get(i));
            if(c instanceof GuiItem) {
                inventory.setItem(i, ((GuiItem) c).getIcon());
            }else{
                inventory.setItem(i,null);
            }
        }
    }

}
