package com.justinoboyle.abilities.java.core;

import java.util.Set;

import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;

public class AbilitiesCore extends JavaPlugin {
    
    private static AbilitiesCore instance;

    private static final String[] classpaths = { "com.justinoboyle", "me.jrl1004" };

    @Override
    public void onEnable() {
        instance = this;
        for (String s : classpaths)
            initClasses(s);
    }

    private void initClasses(String origin) {
        Reflections reflections = new Reflections(origin);
        Set<Class<?>> types = reflections.getTypesAnnotatedWith(InitImplementation.class);
        for (Class c : types) {
            try {
                c.newInstance();
            } catch (Exception e) {
                System.err.println("[SEVERE] Could not instantiate class " + c.getName());
            }
        }
    }
    
    public static AbilitiesCore getInstance() { 
        return instance;
    }

}
