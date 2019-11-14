package mx.iteso.facade.interfaces.impl;

import mx.iteso.facade.interfaces.DJ;
public class Avicii implements DJ {

    @Override
    public void changeSong() {
        System.out.println("Now playing Wake Me Up");
    }

    @Override
    public void dropBeat() {
        System.out.println("OH SHIT.");

    }
    
}