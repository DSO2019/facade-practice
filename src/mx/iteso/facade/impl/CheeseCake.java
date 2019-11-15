package mx.iteso.facade.impl;

import mx.iteso.facade.Dish;

import java.util.ArrayList;

public class CheeseCake implements Dish {
    ArrayList ingredients;
    String name;
    public CheeseCake (ArrayList ingredients) {
        this.ingredients = ingredients;
        this.name = "Cheese cake";
    }
    @Override
    public ArrayList getIngredients() {
        return this.ingredients;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
