package facade.interfaces.impl;

import facade.interfaces.Food;
import facade.interfaces.Tables;

public class FoodSelection implements Food {

    public FoodSelection(){
    }

    public void fastFood() {
        System.out.println("Fast food selection");
    }

    public void veganFood() {
        System.out.println("Vegan food selection");
    }

    public void serveFood() {

    }

    public void serveFood(Tables tables) {
        System.out.println(tables);
    }

}
