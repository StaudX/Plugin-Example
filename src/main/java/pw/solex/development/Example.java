package pw.solex.development;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import pw.solex.development.command.ExampleCommand;
import pw.solex.development.listener.ExampleListener;

public class Example extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("Example has enabled.");

        this.registerCommands();
        this.registerListeners();
    }

    @Override
    public void onDisable() {
        System.out.println("Example has disabled.");
    }

    private void registerCommands() {
        // This is where you register all your commands.

        getCommand("example").setExecutor(new ExampleCommand());
    }

    private void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();

        // This is where you register all your events.

        pm.registerEvents(new ExampleListener(), this);

    }
}
