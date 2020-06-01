package pw.solex.development.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExampleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // This stops a person fro executing a command what is only for ingame use.
        // For example you wouldn't execute /gmc in console.
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You cannot execute this command in console.");
            return true;
        }

        // This checks if the player has permission to run the command.
        if(!sender.hasPermission("example.permission")) {
            sender.sendMessage(ChatColor.RED + "No Permission.");
        } else {
            sender.sendMessage(ChatColor.GREEN + "You have permission.");
        }
        return true;
    }
}
