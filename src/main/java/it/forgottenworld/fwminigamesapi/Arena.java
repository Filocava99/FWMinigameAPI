package it.forgottenworld.fwminigamesapi;

import java.io.Serializable;

public abstract class Arena implements Serializable {

    private final String name;

    public Arena(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
