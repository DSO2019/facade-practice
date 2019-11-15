package com.mycompany.app.impl;

import com.mycompany.app.Bebidas;

/** Vino.*/
public class Vino implements Bebidas {
    @Override
    void serveDrink() {
        System.out.println("Servir Vino");
    }
}
