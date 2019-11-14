package com.iteso.impl;

import com.iteso.interfaces.Drink;


/** Ron Class. */
public class Ron implements Drink {

    /** Name attribute. */
    private String name;

    /** Constructor. */
    public Ron(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    public void serve() {
        System.out.println("Serving Ron: " + this.name);
    }

}
