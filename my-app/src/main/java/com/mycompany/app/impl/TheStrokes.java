package com.mycompany.app.impl;

import com.mycompany.app.Banda;

/** TheStrokes.*/
public class TheStrokes implements Banda {
    /**Start.*/
    @Override
    public void setUp() {
        System.out.println("The Strokes set up");
    }

    /**Finish.*/
    @Override
    public void finish() {
        System.out.println("The Strokes finish");
    }

    /**@param song .*/
    @Override
    public void playSong(final String song) {
        System.out.println("Playing" + song);
    }
}
