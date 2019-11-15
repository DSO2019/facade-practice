package com.mycompany.app.impl;

import com.mycompany.app.ValetParking;

/** Valet.*/
public class Valet implements ValetParking {
    @Override
    void parkCar() {
        System.out.println("Estacionando coche");
    }

    @Override
    void returnCar() {
        System.out.println("Regresando coche");
    }
}
