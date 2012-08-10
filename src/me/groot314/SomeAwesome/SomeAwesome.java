package me.groot314.SomeAwesome;

import org.bukkit.plugin.java.JavaPlugin;

public class SomeAwesome extends JavaPlugin{

	private SomeAwesomeCMD SomeAwesomeExecutor;
	@Override
	public void onEnable() {
		getCommand("SomeAwesome").setExecutor(SomeAwesomeExecutor);
	}
	
	@Override
	public void onDisable() {
	}
}
