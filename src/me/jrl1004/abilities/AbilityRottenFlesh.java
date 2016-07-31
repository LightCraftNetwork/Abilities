package me.jrl1004.abilities;

import me.jrl1004.AbstractAbility;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.justinoboyle.abilities.java.core.InitImplementation;

@InitImplementation
public class AbilityRottenFlesh extends AbstractAbility {

	public AbilityRottenFlesh() {
		super(Material.ROTTEN_FLESH);
		requireOP = true;
	}

	@Override
	public void onUse(Player player) {
		player.setFoodLevel(20);
		player.setSaturation(Float.MAX_VALUE);
		player.setMaxHealth(player.getMaxHealth() * player.getItemInHand().getAmount());
		player.setHealthScale(Math.max(40, player.getHealthScale() * player.getItemInHand().getAmount()));
		player.setHealthScaled(true);
		player.setHealth(1);
		player.setItemInHand(null);
		super.onUse(player);
	}

}
