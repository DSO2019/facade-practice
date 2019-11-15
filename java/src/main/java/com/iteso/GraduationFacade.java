package com.iteso;

import com.iteso.interfaces.Person;
import com.iteso.interfaces.Waiter;
import com.iteso.interfaces.Photographer;
import com.iteso.interfaces.Stage;
import com.iteso.interfaces.Food;
import com.iteso.interfaces.Drink;
import com.iteso.interfaces.Music;
import com.iteso.interfaces.Light;


/** Class. */
public class GraduationFacade {
    /** People. */
    private Person[] people;

    /** Waiters. */
    private Waiter[] waiters;

    /** Photogrpher. */
    private Photographer photographer;

    /** Stage. */
    private Stage stage;

    /** Food. */
    private Food food;

    /** Drink. */
    private Drink drink;

    /** Music. */
    private Music music;

    /** Light. */
    private Light light;

    /** Constructor.
     * @param incomingPeople people.
     * @param incomingWaiters waiters.
     * @param incomingPhotographer photographer.
     * @param incomingStage stage.
     * @param incomingFood food.
     * @param incomingDrink drink.
     * @param incomingMusic music.
     * @param incomingLight light.
     */
    public GraduationFacade(final Person[] incomingPeople,
                            final Waiter[] incomingWaiters,
                            final Photographer incomingPhotographer,
                            final Stage incomingStage,
                            final Food incomingFood,
                            final Drink incomingDrink,
                            final Music incomingMusic,
                            final Light incomingLight) {
        this.people = incomingPeople;
        this.waiters = incomingWaiters;
        this.photographer = incomingPhotographer;
        this.stage = incomingStage;
        this.food = incomingFood;
        this.drink = incomingDrink;
        this.music = incomingMusic;
        this.light = incomingLight;
    }

    /** Start party. */
    public void startParty() {
        System.out.println("The party begins!");
        this.light.on();
        this.music.play();
        for (Waiter w : this.waiters) {
            w.serve();
        }

        for (Person p : this.people) {
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
