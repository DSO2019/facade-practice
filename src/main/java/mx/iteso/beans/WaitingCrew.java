package mx.iteso.beans;

import mx.iteso.interfaces.Waiters;

public class WaitingCrew implements Waiters {

    private String name;

    public WaitingCrew(String incomingName) {
        this.name = incomingName;
    }

    public String getName() {
        return this.name;
    }

    public void serve() {
        System.out.println(this.getName() + " started serving.");
    }
}