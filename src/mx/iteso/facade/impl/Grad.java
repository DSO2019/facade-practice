package mx.iteso.facade.impl;

import mx.iteso.facade.Person;

public class Grad implements Person {
    private String name;
    private String role;
    private int generation;

    public Grad(String name, int generation) {
        this.name = name;
        this.generation = generation;
        this.role = "Grad";
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    public int getGeneration() {
        return this.generation;
    }
}
