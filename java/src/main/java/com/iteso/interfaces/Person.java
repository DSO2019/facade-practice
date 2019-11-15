package com.iteso.interfaces;

/** Person interface. */
public interface Person {
    /** Get name method.
     * @return name.
    */
    String getName();

    /** Eat method.
     * @param food food.
     */
    void eat(Food food);

    /** Drink method.
     * @param drink drink.
     */
    void drink(Drink drink);
}
