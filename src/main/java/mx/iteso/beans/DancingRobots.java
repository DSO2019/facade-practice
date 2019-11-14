package mx.iteso.beans;

import mx.iteso.interfaces.Entertainers;

public class DancingRobots implements Entertainers {

    private String name;

    public DancingRobots(String incomingName) {
        this.name = incomingName;
    }

    public String getName() {
        return this.name;
    }

    public void entertain() {
        System.out.println(this.getName() + " started entertainment.");
    }
}