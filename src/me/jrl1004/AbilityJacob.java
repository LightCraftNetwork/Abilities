package me.jrl1004;

import me.jrl1004.abilities.AbilityBlazePowder;
import me.jrl1004.abilities.AbilityRottenFlesh;
import me.jrl1004.abilities.AbilityWoodenPickaxe;

public class AbilityJacob {

    private static final AbstractAbility[] abilities = { new AbilityBlazePowder(), new AbilityRottenFlesh(), new AbilityWoodenPickaxe() };
    
    public static void init() {
        for(AbstractAbility a : abilities) {}
    }

}
