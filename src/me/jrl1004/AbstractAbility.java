package me.jrl1004;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class AbstractAbility {

	public Material abilityMaterial;

	public boolean requireOP = false;

	public String displayName;

	public String[] lore;

	public AbstractAbility() {
		this.abilityMaterial = Material.AIR;
		displayName = null;
		lore = new String[] {};
		AbilityManager.get().addAbility(this);
	}

	public AbstractAbility(Material material) {
		this.abilityMaterial = material;
		displayName = null;
		lore = new String[] {};
		AbilityManager.get().addAbility(this);
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

	public ItemStack getItem() {
		ItemStack stack = new ItemStack(abilityMaterial);
		if (displayName != null || lore.length > 0) {
			ItemMeta meta = stack.getItemMeta();
			if (displayName != null) meta.setDisplayName(displayName);
			meta.setLore(Arrays.asList(lore));
			stack.setItemMeta(meta);
		}
		return stack;
	}

	public boolean isItem(ItemStack stack) {
		if (stack == null) return false;
		return isItem(stack.getType());
	}

	public boolean isItem(Material material) {
		return material == abilityMaterial;
	}

}
