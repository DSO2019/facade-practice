package com.mycompany.app;

import com.mycompany.app.Bebidas;

/** Bebidas.*/
public class Refresco implements Bebidas {
    @Override
    void serveDrink() {
        System.out.println("Servir Refresco");
    }
}
