package it.forgottenworld.fwminigamesapi;

public interface Minigame{

    void onStart();

    void onStop();

    void onAnnounce();

    void onPlayerJoin();

    void onPlayerLeft();

}
