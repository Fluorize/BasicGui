package com.gmail.fluorize009.basicgui;

import com.gmail.fluorize009.basicgui.gui.Gui;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

import java.util.HashSet;
import java.util.Set;

public class GuiWatcher implements Listener {

    public GuiWatcher(){

    }

    private final Set<Gui> guis = new HashSet<>();

    public Set<Gui> getGuis(){
        return guis;
    }


    public void registerGui(Gui gui){
        guis.add(gui);
    }


    @EventHandler
    public void onClick(InventoryClickEvent event){
        for(Gui gui:guis){
            if(gui.getInventory() == event.getClickedInventory()){
                gui.click(event);
                break;
            }
        }
    }

    @EventHandler
    public void onClose(InventoryCloseEvent event){
        for(Gui gui:guis){
            if(gui.getInventory() == event.getInventory()){
                if(gui.unregisteredOnClose()) {
                    guis.remove(gui);
                }
                break;
            }
        }
    }
}
