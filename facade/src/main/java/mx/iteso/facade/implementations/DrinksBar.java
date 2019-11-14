package mx.iteso.facade.implementations;

import mx.iteso.facade.interfaces.IDrinksBar;

public class DrinksBar implements IDrinksBar {

    public void startDrinksBar() {
        System.out.println("Drinks bar open.");
    }

    public void stopDrinksBar() {
        System.out.println("Drinks bar close.");
    }
}
