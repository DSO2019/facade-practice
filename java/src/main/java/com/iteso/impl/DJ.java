package com.iteso.impl;

import com.iteso.interfaces.Music;


/** DJ Class. */
public class DJ implements Music {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public DJ(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /** Play. */
    public void play() {
        System.out.println(this.name + " is playing music!");
    }

    /** Stop. */
    public void stop() {
        System.out.println(this.name + " stops the music...");
    }
}
