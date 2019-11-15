package mx.iteso.facade.impl;

import mx.iteso.facade.Person;

public class Attendant implements Person {
    private String name;
    private String role;

    public Attendant(String name) {
        this.name = name;
        this.role = "Attendant";
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
