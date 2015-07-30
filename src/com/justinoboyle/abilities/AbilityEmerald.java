package com.justinoboyle.abilities;

import me.jrl1004.AbstractAbility;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class AbilityEmerald extends AbstractAbility {

    public AbilityEmerald() {
        super(Material.EMERALD);
        this.requireOP = false;
        this.displayName = ChatColor.GREEN + "Nice";
    }

    @Override
    public void onUse(Player p) {
        super.onUse(p);
    }
    
}
