package com.mycompany.app.impl;

import com.mycompany.app.Hostess;

/** Host.*/
public class Host implements Hostess {
    /**Greet.*/
    @Override
    public void greet() {
        System.out.println("Saludar a invitado");
    }

    /**Show Table.*/
    @Override
    public void showTable() {
        System.out.println("Guiar a la mesa ");
    }
}
