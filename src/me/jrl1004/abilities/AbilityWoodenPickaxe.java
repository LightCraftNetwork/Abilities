package me.jrl1004.abilities;

import me.jrl1004.AbstractAbility;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.justinoboyle.abilities.java.core.InitImplementation;

@InitImplementation
public class AbilityWoodenPickaxe extends AbstractAbility {

	public AbilityWoodenPickaxe() {
		super(Material.WOOD_PICKAXE);
	}

	@Override
	public void onUse(Player player) {
		for (int x = -2; x <= 2; x++) {
			for (int y = -2; y <= 2; y++) {
				for (int z = -2; z <= 2; z++) {
					Location loc = player.getLocation().getBlock().getLocation().add(x, y, z);
					loc.getBlock().breakNaturally();
					loc.getWorld().playEffect(loc, Effect.MOBSPAWNER_FLAMES, null);
				}
			}
		}
		super.onUse(player);
	}

}
