package mx.iteso.beans;

import mx.iteso.interfaces.Decoration;

public class Banners implements Decoration {

    private String name;

    public Banners(String incomingName) {
        this.name = incomingName;
    }

    public String getName() {
        return this.name;
    }

    public void decorate() {
        System.out.println(this.getName() + " are being placed.");
    }
}