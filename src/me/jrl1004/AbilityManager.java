package me.jrl1004;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.justinoboyle.abilities.java.core.AbilitiesCore;
import com.justinoboyle.abilities.java.core.InitImplementation;

@InitImplementation
public class AbilityManager implements Listener
{
	private static AbilityManager manager;

	private ArrayList<AbstractAbility> abilities;

	private AbilityManager() {
		abilities = new ArrayList<AbstractAbility>();
		Bukkit.getPluginManager().registerEvents(this, AbilitiesCore.getInstance());
	}

	public static AbilityManager get() {
		if (manager == null) manager = new AbilityManager();
		return manager;
	}

	public void addAbility(AbstractAbility ability) {
		abilities.add(ability);
	}

	@EventHandler
	public void onClick(PlayerInteractEvent event) {
		if (event.getPlayer().isSneaking()) return;
		if (!event.getAction().toString().contains("RIGHT")) return;
		for (AbstractAbility abb : abilities) {
			if (abb.isItem(event.getItem()))
				abb.onUse(event.getPlayer());
		}
	}

	@EventHandler
	public void onPlace(BlockPlaceEvent event) {
		if (event.getPlayer().isSneaking()) return;
		for (AbstractAbility abb : abilities) {
			if (abb.isItem(event.getBlockPlaced().getType()))
				abb.onUse(event.getPlayer());
		}
	}

}
