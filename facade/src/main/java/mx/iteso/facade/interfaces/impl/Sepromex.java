package mx.iteso.facade.interfaces.impl;

import mx.iteso.facade.interfaces.Security;
public class Sepromex implements Security {

    @Override
    public void fight() {
        System.out.println("FIGHT!");
    }

    @Override
    public void organizeSecurity() {
        System.out.println("Organizing security with SEPROMEX");
    }
}
