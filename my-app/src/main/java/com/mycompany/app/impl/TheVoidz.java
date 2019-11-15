package com.mycompany.app.impl;

import com.mycompany.app.Banda;

/** TheVoidz.*/
public class TheVoidz implements Banda {
    /**Start.*/
    @Override
    public void setUp() {
        System.out.println("The Voidz set up");
    }

    /**Finish.*/
    @Override
    public void finish() {
        System.out.println("The Voidz finish");
    }

    /**@param song .*/
    @Override
    public void playSong(final String song) {
        System.out.println("Playing" + song);
    }
}
