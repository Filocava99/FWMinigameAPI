package it.forgottenworld.fwminigamesapi;

import org.bukkit.Bukkit;

import java.io.*;
import java.util.Optional;
import java.util.logging.Level;

public class StorageService {

    public static boolean serializeArena(Minigame minigame, Arena arena) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(minigame.getDataFolder(), "/arenas/" + arena.getName()), false));
            objectOutputStream.writeObject(arena);
            Bukkit.getLogger().log(Level.INFO, "Arena \"" + arena.getName() + "\" successfully saved.");
            return true;
        } catch (IOException e) {
            Bukkit.getLogger().log(Level.INFO, "Error while saving arena \"" + arena.getName() + "\".");
            return false;
        }
    }

    public static Optional<Arena> deserializeArena(Minigame minigame, String arenaName) {
        Optional<Arena> arenaOptional = Optional.empty();
        try {
            ObjectInput objectInputStream = new ObjectInputStream(new FileInputStream(new File(minigame.getDataFolder(), "/arenas/" + arenaName)));
            Arena arena = (Arena) objectInputStream.readObject();
            Bukkit.getLogger().log(Level.INFO, "Arena \"" + arena.getName() + "\" successfully saved.");
            return Optional.of(arena);
        } catch (ClassNotFoundException | IOException e) {
            Bukkit.getLogger().log(Level.INFO, "Error while saving arena \"" + arenaName + "\".");
            e.printStackTrace();
            return arenaOptional;
        }
    }
}
