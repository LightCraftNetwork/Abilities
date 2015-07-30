package me.jrl1004;

import org.bukkit.Material;
import org.bukkit.entity.Player;

public abstract class AbstractAbility {

	private Material abilityMaterial;

	private boolean requireOP = false;

	public AbstractAbility() {
		this.abilityMaterial = Material.AIR;
	}

	public AbstractAbility(Material material) {
		this.abilityMaterial = material;
	}

	public Material getMaterial() {
		return this.abilityMaterial;
	}

	public void onUse(Player player) {
	}

	public void onPlace(Player player) {
	}

	public boolean requireOP() {
		return this.requireOP;
	}

}
