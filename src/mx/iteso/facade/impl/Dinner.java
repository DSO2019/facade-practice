package mx.iteso.facade.impl;

import mx.iteso.facade.Dish;
import mx.iteso.facade.Menu;

import java.util.ArrayList;


public class  Dinner implements Menu {
    ArrayList dishes;

    public Dinner() {
        this.dishes = new ArrayList();
    }

    @Override
    public ArrayList getDishes() {
        return this.dishes;
    }

    public void addDishes(Dish dish) {
        this.dishes.add(dish);
    }
}
