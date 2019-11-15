package com.mycompany.app.impl;

import com.mycompany.app.Bouncer;

/** Security.*/
public class Security implements Bouncer {
    @Override
    void checkGuestList() {
        System.out.println("Buscando en la lista de invitados");
    }
}
