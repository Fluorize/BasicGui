package com.gmail.fluorize009.basicgui.gui;

import com.gmail.fluorize009.basicgui.content.GuiContent;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuiBuilder {

    private final int size;
    private final List<GuiContent> contents;

    public GuiBuilder(int guiSize){
        if(guiSize % 9 != 0){
            throw new IllegalArgumentException("GUI size must be multiple of 9 ");
        }
        size = guiSize;
        contents = new ArrayList<>(guiSize);
        for(int i=0;i<guiSize;i++) {
            contents.add(i,null);
        }
    }

    public void setContent(int slot, GuiContent content){
        contents.set(slot,content);
    }

    public void fillContent(GuiContent content){
        Collections.fill(contents, content);
    }

    public void fillContent(GuiContent content,int x,int y,int xSize,int ySize){

    }

    public void setTitle(Component title){

    }


    public Gui getGui(){
        Inventory inv = Bukkit.createInventory(null,size);
        return new ConcreteGui(inv,contents);
    }

}
