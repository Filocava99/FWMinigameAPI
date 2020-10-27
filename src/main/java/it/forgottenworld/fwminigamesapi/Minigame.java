package it.forgottenworld.fwminigamesapi;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class Minigame extends JavaPlugin {

    private ArenaController arenaController;

    public ArenaController getArenaController() {
        return arenaController;
    }
}
