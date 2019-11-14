package facade.interfaces.impl;

import facade.interfaces.Drinks;

public class DrinksSelection implements Drinks {
    public void AlcoholicDrink() {
        System.out.println("Drink with alcohol selected");
    }

    public void ColaDrink() {
        System.out.println("Cola drink selected");
    }

    public void FreshWater() {
        System.out.println("Fresh water drink selected");
    }

    public void serveDrinks() {

    }
}
