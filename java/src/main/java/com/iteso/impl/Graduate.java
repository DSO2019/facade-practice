package com.iteso.impl;

import com.iteso.interfaces.Drink;
import com.iteso.interfaces.Food;
import com.iteso.interfaces.Person;


/** Graduate Class. */
public class Graduate implements Person {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public Graduate(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /** Eat method.
     * @param food food.
     */
    public void eat(final Food food) {
        System.out.println("Eating " + food.getName());
    }

    /** Drink method.
     * @param drink drink.
     */
    public void drink(final Drink drink) {
        System.out.println("Drinking " + drink.getName());
    }
}
