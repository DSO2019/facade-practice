package com.mycompany.app.impl;

import com.mycompany.app.Banda;

/** Banda.*/
public class TheStrokes implements Banda {
    @Override
    void setUp() {
        System.out.println( "The Strokes set up" );
    }

    @Override
    void finish() {
        System.out.println( "The Strokes finish" );
    }

    @Override
    void playSong(String song) {
        System.out.println("Playing" + song);
    }
}
