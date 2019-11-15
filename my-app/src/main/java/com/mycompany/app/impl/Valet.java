package com.mycompany.app.impl;

import com.mycompany.app.ValetParking;

/** Valet.*/
public class Valet implements ValetParking {
    /**Park.*/
    @Override
    public void parkCar() {
        System.out.println("Estacionando coche");
    }

    /**Return.*/
    @Override
    public void returnCar() {
        System.out.println("Regresando coche");
    }
}
