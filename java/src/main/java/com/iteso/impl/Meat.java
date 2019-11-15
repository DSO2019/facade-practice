package com.iteso.impl;

import com.iteso.interfaces.Food;


/** Meat Class. */
public class Meat implements Food {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public Meat(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /** Serve. */
    public void serve() {
        System.out.println("Serving Meat: " + this.name);
    }

}
