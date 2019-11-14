package com.iteso.impl;

import com.iteso.interfaces.Food;


/** Meat Class. */
public class Meat implements Food {

    /** Name attribute. */
    private String name;

    /** Constructor. */
    public Meat(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    public void serve() {
        System.out.println("Serving Meat: " + this.name);
    }

}
