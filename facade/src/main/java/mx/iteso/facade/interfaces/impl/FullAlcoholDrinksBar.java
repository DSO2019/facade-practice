package mx.iteso.facade.interfaces.impl;
import mx.iteso.facade.interfaces.DrinksBar;
/**FullAlcoholDrinksBar. */
public class FullAlcoholDrinksBar implements DrinksBar {
    /**prepareDrinks. */
    @Override
    public void prepareDrinks() {
        System.out.println("Preparing FULL ALCOHOL drinks");
    }
    /**serveDrink. */
    @Override
    public void serveDrink() {
        System.out.println("Serving alcohol drink...");
    }
}
