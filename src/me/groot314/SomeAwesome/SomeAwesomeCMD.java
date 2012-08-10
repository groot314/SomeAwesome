package me.groot314.SomeAwesome;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SomeAwesomeCMD implements CommandExecutor{

	@SuppressWarnings("unused")
	private SomeAwesome plugin;

	public SomeAwesomeCMD(SomeAwesome plugin) {
		this.plugin = plugin;
	}

	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable,
			String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("someawesome")) {
			sender.sendMessage("HI!");
		}
		
		return false;
	}

}
