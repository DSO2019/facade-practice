package mx.iteso;

import mx.iteso.interfaces.*;

/**
 * Graduation Facade class.
 *
 */
public class GraduationFacade {
    Decoration decoration;
    Drinks drinks;
    Entertainers entertainers;
    Food food;
    Music music;
    Snacks snacks;
    Venue venue;
    Waiters waiters;

    public GraduationFacade(Decoration incomingDecoration, Drinks incomingDrinks,
                             Entertainers incomingEntertainers, Food incomingFood, Music incomingMusic,
                             Snacks incomingSnacks, Venue incomingVenue, Waiters incomingWaiters) {
        this.decoration = incomingDecoration;
        this.drinks = incomingDrinks;
        this.entertainers = incomingEntertainers;
        this.food = incomingFood;
        this.music = incomingMusic;
        this.snacks = incomingSnacks;
        this.venue = incomingVenue;
        this.waiters = incomingWaiters;
    }

    public void startGraduationParty() {
        System.out.println("STARTING GRADUATION PREP:");
        this.decoration.decorate();
        this.snacks.serve();
        this.food.prepare();
        System.out.println("STARTING GRADUATION EVENT:");
        this.venue.openVenue();
        this.music.play();
        this.waiters.serve();
        this.drinks.serve();
        this.entertainers.entertain();
    }

}
