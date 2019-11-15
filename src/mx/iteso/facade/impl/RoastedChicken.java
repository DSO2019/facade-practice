package mx.iteso.facade.impl;

import mx.iteso.facade.Dish;

import java.util.ArrayList;

public class RoastedChicken implements Dish {
    ArrayList ingredients;
    String name;

    public RoastedChicken(ArrayList ingredients) {
        this.name = "Roasted Chicken";
        this.ingredients = ingredients;
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
