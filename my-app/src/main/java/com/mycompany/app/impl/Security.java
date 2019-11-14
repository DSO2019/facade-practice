package com.mycompany.app;

import com.mycompany.app.Bouncer;

/** Bebidas.*/
public class Security implements Bouncer {
    @Override
    void checkGuestList(String name) {
        System.out.println("Buscando a " + name + " en la lista de invitados");
    }
}
