package com.gmail.fluorize009.basicgui.content.button;

import com.gmail.fluorize009.basicgui.holder.ContentHolder;
import com.gmail.fluorize009.basicgui.holder.ContentList;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ScrollButton extends GuiButton{

    private final ContentHolder target;
    private final ScrollType type;

    public ScrollButton(ItemStack icon, ContentHolder target,ScrollType type) {
        super(icon);
        if(!type.getHolderClass().isInstance(target)){
            throw new IllegalArgumentException();
        }
        this.target = target;
        this.type = type;
    }


    @Override
    public boolean perform(Player performer) {
        switch (type){
            case NEXT:
                ((ContentList) target).goNext();
                break;
            case BACK:
                ((ContentList) target).goBack();
                break;
        }
        return false;
    }

    @Override
    public boolean isCloseTrigger() {
        return false;
    }


    public enum ScrollType{
        NEXT(ContentList.class),
        BACK(ContentList.class);

        private final Class<?> holderClass;

        ScrollType(Class<?> holderClass){
            this.holderClass = holderClass;
        }

        public Class<?> getHolderClass() {
            return holderClass;
        }
    }
}
