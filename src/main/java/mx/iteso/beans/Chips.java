package mx.iteso.beans;

import mx.iteso.interfaces.Snacks;

public class Chips implements Snacks {

    private String name;

    public Chips(String incomingName) {
        this.name = incomingName;
    }

    public String getName() {
        return this.name;
    }

    public void serve() {
        System.out.println(this.getName() + " are being served.");
    }
}