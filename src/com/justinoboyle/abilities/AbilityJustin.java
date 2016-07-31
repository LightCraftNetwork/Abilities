package com.justinoboyle.abilities;

import me.jrl1004.AbstractAbility;

public class AbilityJustin {

    private static final AbstractAbility[] abilities = { new AbilityEmerald() };
    
    public static void init() {
        for(AbstractAbility a : abilities) {}
    }

}
