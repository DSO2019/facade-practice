package com.mycompany.app.impl;

import com.mycompany.app.DJ;

/** DJ1.*/
public class DJ1 implements DJ {
    /**Start.*/
    @Override
    public void setUp() {
        System.out.println("Dj set up");
    }

    /**Finish.*/
    @Override
    public void finish() {
        System.out.println("Dj finish");
    }

    /**@param song .*/
    @Override
    public void playSong(final String song) {
        System.out.println("Playing" + song);
    }
}
