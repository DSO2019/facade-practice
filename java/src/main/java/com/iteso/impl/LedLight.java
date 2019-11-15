package com.iteso.impl;

import com.iteso.interfaces.Light;


/** LedLight Class. */
public class LedLight implements Light {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public LedLight(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /** On. */
    public void on() {
        System.out.println("Turning on lights: " + this.name);
    }

    /** Off. */
    public void off() {
        System.out.println("Turning off lights: " + this.name);
    }

}
