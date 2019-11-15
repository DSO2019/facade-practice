package mx.iteso.facade.impl;

import mx.iteso.facade.Person;

public class Organizer implements Person {
    private String name;
    private String role;

    public Organizer(final String name) {
        this.name = name;
        this.role = "Organizer";

    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRole() {
        return this.role;
    }


}
