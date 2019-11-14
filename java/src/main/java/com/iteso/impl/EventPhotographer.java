package com.iteso.impl;

import com.iteso.interfaces.Person;
import com.iteso.interfaces.Photographer;;

/** EventPhotographer class. */
public class EventPhotographer implements Photographer {

    /** Name attribute. */
    private String name;

    /** Constructor. */
    public EventPhotographer(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /** Take photos method.
     * @param person person.
     */
    public void takePhotos(Person person) {
        System.out.println("Take photos to " + person.getName());        
    }
}
