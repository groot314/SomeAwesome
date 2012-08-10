package me.groot314.SomeAwesome;

import org.bukkit.plugin.java.JavaPlugin;

public class SomeAwesome extends JavaPlugin{
	
	private SomeAwesomeCMD Executor;
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new SomeAwesomeEvent(), this);
		
		Executor = new SomeAwesomeCMD(this);
		getCommand("SomeAwesome").setExecutor(Executor);
	}
	
	@Override
	public void onDisable() {
	}
}
