package com.gmail.fluorize009.basicgui;

import com.gmail.fluorize009.basicgui.content.GuiContent;
import com.gmail.fluorize009.basicgui.content.GuiItem;
import com.gmail.fluorize009.basicgui.content.button.CloseButton;
import com.gmail.fluorize009.basicgui.content.button.WarpButton;
import com.gmail.fluorize009.basicgui.content.proxy.ProxyContent;
import com.gmail.fluorize009.basicgui.content.button.ConsumerButton;
import com.gmail.fluorize009.basicgui.content.button.ScrollButton;
import com.gmail.fluorize009.basicgui.content.display.GuiDisplay;
import com.gmail.fluorize009.basicgui.gui.Gui;
import com.gmail.fluorize009.basicgui.gui.GuiBuilder;
import com.gmail.fluorize009.basicgui.holder.ContentList;
import com.gmail.fluorize009.basicgui.holder.ContentListBase;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class BasicGui extends JavaPlugin {

    private final GuiWatcher watcher = new GuiWatcher();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(watcher,this);
    }


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        GuiBuilder builder = new GuiBuilder(54);
        GuiDisplay frame = new GuiDisplay(IconUtils.createIcon(Material.GRAY_STAINED_GLASS_PANE,1));
        builder.fillContent(frame);

        GuiContent button1 = new ConsumerButton(IconUtils.createIcon(Material.EMERALD,1, Component.text("TestConsumer")), List.of((p)->p.sendMessage("Consumer Test!")));
        builder.setContent(1,2,button1);
        builder.setContent(7,2,button1);

        ProxyContent pc = new ProxyContent();
        GuiItem card1 = new GuiDisplay(IconUtils.createIcon(Material.PAPER,1, Component.text("Scroll 1")));
        GuiItem card2 = new GuiDisplay(IconUtils.createIcon(Material.PAPER,2, Component.text("Scroll 2")));
        GuiItem card3 = new GuiDisplay(IconUtils.createIcon(Material.PAPER,3, Component.text("Scroll 3")));
        GuiItem card4 = new GuiDisplay(IconUtils.createIcon(Material.PAPER,4, Component.text("Scroll 4"),List.of(Component.text("This is the end of the array!")),true));
        GuiContent button2 = new WarpButton(IconUtils.createIcon(Material.ENDER_PEARL,1, Component.text("tp to 0,100,0")), new Location(((Player) sender).getWorld(),0,100,0));
        ContentList list = new ContentListBase(List.of(card1,card2,card3,button2,card4),List.of(pc));
        GuiContent button3 = new ScrollButton(IconUtils.createIcon(Material.ARROW,1,Component.text("Next")),list, ScrollButton.ScrollType.NEXT);
        GuiContent button4 = new ScrollButton(IconUtils.createIcon(Material.ARROW,1,Component.text("Back")),list, ScrollButton.ScrollType.BACK);
        builder.setContent(1,3,button3);
        builder.setContent(2,3,pc);
        builder.setContent(3,3,button4);

        GuiContent button5 = new CloseButton(IconUtils.createIcon(Material.BARRIER,1,Component.text("Close")));
        builder.setContent(4,5,button5);

        Gui gui = builder.getGui();
        watcher.registerGui(gui);
        ((Player) sender).openInventory(gui.getInventory());
        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public GuiWatcher getWatcher() {
        return watcher;
    }
}
