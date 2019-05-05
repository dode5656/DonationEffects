package me.xcodiq.donationeffects.commands;

import me.xcodiq.donationeffects.Core;
import me.xcodiq.donationeffects.commands.base.CommandBase;
import me.xcodiq.donationeffects.utilities.ChatUtils;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class AboutCommand extends CommandBase {

    public AboutCommand() {
        super("about", "All information about this plugin", "donationeffects.about", null, 0, 0);
    }

    @Override
    public void execute(CommandSender sender, String[] args) throws NotImplementedException {
        PluginDescriptionFile desc = Core.getInstance().getDescription();
        sender.sendMessage(ChatUtils.format("&8&m-+----------------------------------+-"));
        sender.sendMessage(ChatUtils.format(" "));
        sender.sendMessage(ChatUtils.format("&b&l[!] &bInformation about this plugin"));
        sender.sendMessage(ChatUtils.format(" "));
        sender.sendMessage(ChatUtils.format(" &3× &b&lName &7" + desc.getName()));
        sender.sendMessage(ChatUtils.format(" &3× &b&lVersion &7" + desc.getVersion()));
        sender.sendMessage(ChatUtils.format(" &3× &b&lAuthor &7xCodiq"));
        sender.sendMessage(ChatUtils.format(" &3× &b&lWebsite &7" + desc.getWebsite()));
        sender.sendMessage(ChatUtils.format(""));
        sender.sendMessage(ChatUtils.format(" &3× &b&lFullName &7" + desc.getFullName()));
        sender.sendMessage(ChatUtils.format(" "));
        sender.sendMessage(ChatUtils.format(" &7(( &f" + desc.getDescription() + " &7))"));
        sender.sendMessage(ChatUtils.format("&8&m-+----------------------------------+-"));
    }
}
