package me.jrl1004.abilities;

import me.jrl1004.AbstractAbility;

import org.bukkit.Material;

import com.justinoboyle.abilities.java.core.InitImplementation;

@InitImplementation
public class AbilityBlazePowder extends AbstractAbility {

	public AbilityBlazePowder() {
		super(Material.BLAZE_POWDER);
		requireOP = true;
	}

}
