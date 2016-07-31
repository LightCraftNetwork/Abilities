package com.justinoboyle.abilities;

import java.util.List;
import java.util.Random;

import me.jrl1004.AbstractAbility;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class AbilityEmerald extends AbstractAbility {

    public AbilityEmerald() {
        super(Material.EMERALD);
        this.requireOP = false;
        this.displayName = ChatColor.GREEN + "Nice";
    }

    @Override
    public void onUse(Player p) {
        p.teleport(((List<Player>) Bukkit.getOnlinePlayers()).get(new Random().nextInt(Bukkit.getOnlinePlayers().size())));
        ItemStack i = p.getItemInHand();
        i.setAmount(Math.max(p.getItemInHand().getAmount() - 1, 0));
        p.setItemInHand(i);
        p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
        p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 1);
        super.onUse(p);
    }
    
}
