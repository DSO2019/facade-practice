package mx.iteso.beans;

import mx.iteso.interfaces.Food;

public class Pasta implements Food {

    private String name;

    public Pasta(String incomingName) {
        this.name = incomingName;
    }

    public String getName() {
        return this.name;
    }

    public void prepare() {
        System.out.println("Preparing the " + this.getName() + " dish.");
    }
}