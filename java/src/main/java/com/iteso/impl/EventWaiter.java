package com.iteso.impl;

import com.iteso.interfaces.Waiter;


/** EventWaiter class. */
public class EventWaiter implements Waiter {

    /** Name attribute. */
    private String name;

    /** Constructor. */
    public EventWaiter(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /** Serve method.
     * @param person person.
     */
    public void serve() {
        System.out.println("Serve to all people in the event");
    }
}
