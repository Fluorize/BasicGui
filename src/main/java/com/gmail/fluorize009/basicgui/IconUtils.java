package com.gmail.fluorize009.basicgui;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class IconUtils {

    private IconUtils(){
    }


    public static ItemStack createIcon(Material material,int amount){
        return createIcon(material,amount,Component.text(""));
    }

    public static ItemStack createIcon(Material material,int amount,Component name){
        return createIcon(material,amount,name, new ArrayList<>());
    }

    public static ItemStack createIcon(Material material, int amount, Component name, List<Component> lore){
        return createIcon(material,amount,name,lore,false);
    }

    public static ItemStack createIcon(Material material, int amount, Component name, List<Component> lore,boolean enchanted){
        ItemStack item = new ItemStack(material,amount);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(name);
        meta.lore(lore);
        meta.lore(lore);
        if(enchanted) {
            meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
        item.setItemMeta(meta);
        return item;
    }
}
