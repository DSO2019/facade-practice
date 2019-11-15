package com.mycompany.app;

import com.mycompany.app.interfaces.*;

public class GraduationPartyFacade {
    Animals animals;
    Drinks drinks;
    Confetti confetti;
    Dreams dreams;
    Hopes hopes;
    MentalDisorders mentalDisorders;
    SharpObjects sharpObjects;
    Snacks snacks;

    public GraduationPartyFacade(Animals iAnimals, Drinks iDrinks,
                             Confetti iConfetti, Dreams iDreams, Hopes iHopes,
                             MentalDisorders iMentalDisorders, SharpObjects iSharpObjects, Snacks iSnacks) {
        this.animals = iAnimals;
        this.drinks = iDrinks;
        this.confetti = iConfetti;
        this.dreams = iDreams;
        this.hopes = iHopes;
        this.mentalDisorders = iMentalDisorders;
        this.sharpObjects = iSharpObjects;
        this.snacks = iSnacks;
    }

    public void organizeGraduationParty() {
        System.out.println("Preparing the most EXTRA party forevaaaa:");
        this.animals.tame();
        this.drinks.serve();
        this.confetti.throwToTheFace();
        this.dreams.dream();
        this.hopes.hope();
        this.mentalDisorders.showTerribleSymptoms();
        this.sharpObjects.cut();
        this.snacks.eat();
    }

}