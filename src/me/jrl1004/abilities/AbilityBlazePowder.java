package me.jrl1004.abilities;

import me.jrl1004.AbstractAbility;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.util.BlockIterator;

import com.justinoboyle.abilities.java.core.InitImplementation;

@InitImplementation
public class AbilityBlazePowder extends AbstractAbility {

	public AbilityBlazePowder() {
		super(Material.BLAZE_POWDER);
		this.requireOP = false;
		this.displayName = ChatColor.GOLD + "Afterburner";
		this.lore = new String[] {ChatColor.RED + "420 Blaze It"};
	}

	@Override
	public void onUse(Player player) {
		BlockIterator iterator = new BlockIterator(player, (Bukkit.getViewDistance() * 16) - 4);
		while (iterator.hasNext()) {
			Block b = iterator.next();
			b.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, null);
			b.getWorld().strikeLightning(b.getLocation());
		}
		super.onUse(player);
	}

}
