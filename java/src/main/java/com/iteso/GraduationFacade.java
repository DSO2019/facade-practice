package com.iteso;

import com.iteso.interfaces.Person;
import com.iteso.interfaces.Waiter;
import com.iteso.interfaces.Photographer;
import com.iteso.interfaces.Stage;
import com.iteso.interfaces.Food;
import com.iteso.interfaces.Drink;
import com.iteso.interfaces.Music;
import com.iteso.interfaces.Light;


public class GraduationFacade {
    Person[] people;
    Waiter[] waiters;
    Photographer photographer;
    Stage stage;
    Food food;
    Drink drink;
    Music music;
    Light light;

    public GraduationFacade(Person[] incomingPeople,
                            Waiter[] incomingWaiters,
                            Photographer incomingPhotographer,
                            Stage incomingStage,
                            Food incomingFood,
                            Drink incomingDrink,
                            Music incomingMusic,
                            Light incomingLight) {
        this.people = incomingPeople;
        this.waiters = incomingWaiters;
        this.photographer = incomingPhotographer;
        this.stage = incomingStage;
        this.food = incomingFood;
        this.drink = incomingDrink;
        this.music = incomingMusic;
        this.light = incomingLight;
    }

    public void startParty() {
        System.out.println("The party begins!");
        this.light.on();
        this.music.play();
        for(Waiter w : this.waiters) {
            w.serve();
        }

        for(Person p : this.people) {
            p.eat(this.food);
            p.drink(this.drink);
            this.photographer.takePhotos(p);
            this.stage.dance(p);
        }

        this.music.stop();
        this.light.off();
        System.out.println("The party is over...");
    }
    
}