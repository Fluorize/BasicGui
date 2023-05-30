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

    private Component title = Component.text("GUI");

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
        if(slot<0 || size<=slot){
            throw new IndexOutOfBoundsException();
        }
        contents.set(slot,content);
    }

    public void setContent(int x,int y,GuiContent content){
        setContent(y*9+x,content);
    }

    public void fillContent(GuiContent content){
        Collections.fill(contents, content);
    }

    public void fillContent(GuiContent content,int x,int y,int xSize,int ySize) {
        for (int iy = 0; iy < ySize; iy++) {
            for (int ix = 0; ix < xSize; ix++) {
                contents.set((y + iy) * 9 + (x + ix), content);
            }
        }
    }

    public void setTitle(Component title){
        this.title = title;
    }


    public Gui getGui(){
        Inventory inv = Bukkit.createInventory(null,size,title);
        return new CustomizableGui(inv,contents);
    }

}
