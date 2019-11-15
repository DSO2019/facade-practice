package com.mycompany.app.impl;

import com.mycompany.app.Comediante;

/** CarlosBallarta.*/
public class CarlosBallarta implements Comediante {

    @Override
    void startStandUp() {
        System.out.println("Inicia Carlos Ballarta");
    }

    @Override
    void joke() {
        System.out.println("Chiste");
    }

    @Override
    void finishStandUp() {
        System.out.println("Termina Carlos Ballarta");
    }
}
