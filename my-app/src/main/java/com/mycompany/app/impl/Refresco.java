package com.mycompany.app.impl;

import com.mycompany.app.Bebidas;

/** Refresco.*/
public class Refresco implements Bebidas {
    /**Serve.*/
    @Override
    public void serveDrink() {
        System.out.println("Servir Refresco");
    }
}
