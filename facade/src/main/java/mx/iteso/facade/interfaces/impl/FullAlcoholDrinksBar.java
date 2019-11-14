package mx.iteso.facade.interfaces.impl;

import mx.iteso.facade.interfaces.DrinksBar;
public class FullAlcoholDrinksBar implements DrinksBar {

    @Override
    public void prepareDrinks() {
        System.out.println("Preparing FULL ALCOHOL drinks");

    }

    @Override
    public void serverDrink() {
        System.out.println("Serving alcohol drink...");

    }

}
