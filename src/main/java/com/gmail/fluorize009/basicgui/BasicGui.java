package com.gmail.fluorize009.basicgui;

import com.gmail.fluorize009.basicgui.content.button.ConsumerButton;
import com.gmail.fluorize009.basicgui.content.frame.GuiFrame;
import com.gmail.fluorize009.basicgui.gui.Gui;
import com.gmail.fluorize009.basicgui.gui.GuiBuilder;
import net.kyori.adventure.text.Component;
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
        GuiFrame frame = new GuiFrame(IconUtils.createIcon(Material.GRAY_STAINED_GLASS_PANE,1));
        builder.fillContent(frame);
        ConsumerButton button1 = new ConsumerButton(IconUtils.createIcon(Material.EMERALD,1, Component.text("TestConsumer")), List.of((p)->p.sendMessage("Consumer Test!")));
        builder.setContent(1,2,button1);
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
