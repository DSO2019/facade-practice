package com.mycompany.app.impl;

import com.mycompany.app.Hostess;

/** Host.*/
public class Host implements Hostess {
    @Override
    void greet() {
        System.out.println("Saludar a invitado");
    }
    
    @Override
    void showTable() {
        System.out.println("Guiar a la mesa ");
    }
}
