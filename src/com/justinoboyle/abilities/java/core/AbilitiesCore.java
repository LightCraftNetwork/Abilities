package com.justinoboyle.abilities.java.core;

import me.jrl1004.AbilityJacob;

import org.bukkit.plugin.java.JavaPlugin;

import com.justinoboyle.abilities.AbilityJustin;

public class AbilitiesCore extends JavaPlugin {

    private static AbilitiesCore instance;
    
    @Override
    public void onEnable() {
        instance = this;
        AbilityJacob.init();
        AbilityJustin.init();
    }

    public static AbilitiesCore getInstance() {
        return instance;
    }

}
