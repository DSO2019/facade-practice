package mx.iteso.beans;

import mx.iteso.interfaces.Music;

public class Dj implements Music {

    private String name;

    public Dj(String incomingName) {
        this.name = incomingName;
    }

    public String getName() {
        return this.name;
    }

    public void play() {
        System.out.println(this.getName() + " started playing music.");
    }
}