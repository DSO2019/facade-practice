package com.mycompany.app.impl;

import com.mycompany.app.Banda;

/** Banda.*/
public class TheVoidz implements Banda {
    @Override
    void setUp() {
        System.out.println( "The Voidz set up" );
    }

    @Override
    void finish() {
        System.out.println( "The Voidz finish" );
    }

    @Override
    void playSong(String song) {
        System.out.println("Playing" + song);
    }
}
