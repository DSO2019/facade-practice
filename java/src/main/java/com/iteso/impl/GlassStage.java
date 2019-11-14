package com.iteso.impl;

import com.iteso.interfaces.Person;
import com.iteso.interfaces.Stage;

/** GlassStage Class. */
public class GlassStage implements Stage {

    /** Name attribute. */
    private String name;

    /** Constructor. */
    public GlassStage(final String newName) {
        this.name = newName;
    }

    /**
     * Return name.
     * 
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Dance method.
     * @param incomingPeople peoplle.
     */
    public void dance(Person incomingPeople) {
        System.out.println(incomingPeople.getName() + "is dancing");
    }

}
