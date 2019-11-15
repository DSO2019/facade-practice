package com.mycompany.app.impl;

import com.mycompany.app.Bouncer;

/** Security.*/
public class Security implements Bouncer {
    /**Check List.*/
    @Override
    public void checkGuestList() {
        System.out.println("Buscando en la lista de invitados");
    }
}
