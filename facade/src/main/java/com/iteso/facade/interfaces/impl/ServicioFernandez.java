package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Valet;

public class ServicioFernandez implements Valet{

    public void receivePeople(){
        System.out.print("Buenas Tardes Caballero");
    };

    public void parkCars(){
        System.out.print("Parkeando");
    };

    public void handleDrunks(){
        System.out.print("Por favor... no... no por ahi... joven!");
    };
}