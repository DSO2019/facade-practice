package com.iteso.impl;

import com.iteso.interfaces.Drink;


/** Ron Class. */
public class Ron implements Drink {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public Ron(final String newName) {
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
        System.out.println("Serving Ron: " + this.name);
    }

}
