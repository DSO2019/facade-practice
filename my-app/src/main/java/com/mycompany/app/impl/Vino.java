package com.mycompany.app.impl;

import com.mycompany.app.Bebidas;

/** Vino.*/
public class Vino implements Bebidas {
    /**Serve.*/
    @Override
    public void serveDrink() {
        System.out.println("Servir Vino");
    }
}
