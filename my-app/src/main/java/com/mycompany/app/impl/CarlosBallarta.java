package com.mycompany.app.impl;

import com.mycompany.app.Comediante;

/** CarlosBallarta.*/
public class CarlosBallarta implements Comediante {

    /**Start.*/
    @Override
    public void startStandUp() {
        System.out.println("Inicia Carlos Ballarta");
    }

    /**Joke.*/
    @Override
    public void joke() {
        System.out.println("Chiste");
    }

    /**Finish.*/
    @Override
    public void finishStandUp() {
        System.out.println("Termina Carlos Ballarta");
    }
}
