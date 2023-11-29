package AnvilRepair;

import org.bukkit.plugin.java.JavaPlugin;

import AnvilRepair.Commands.ReloadCommand;
import AnvilRepair.Listeners.PlayerInteract;

public class Main extends JavaPlugin {

	public void onEnable() {

		getServer().getConsoleSender().sendMessage("§8[§bVenixRepair§8]§a has been enabled!");
		getServer().getConsoleSender().sendMessage("§8[§bVenixRepair§8]§a discord: https://discord.gg/ph8gHRyaPa");
		getServer().getPluginManager().registerEvents(new PlayerInteract(this), this);
		getCommand("repair").setExecutor(new ReloadCommand(this));
		saveDefaultConfig();
		
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§8[§bVenixRepair§8]§4 has been disabled!");
		getServer().getConsoleSender().sendMessage("§8[§bVenixRepair§8]§4 discord: https://discord.gg/ph8gHRyaPa");
		
	}
}
