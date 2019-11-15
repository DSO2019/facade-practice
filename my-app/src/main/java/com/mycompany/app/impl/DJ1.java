package com.mycompany.app.impl;

import com.mycompany.app.DJ;

/** DJ1.*/
public class DJ1 implements DJ {
    @Override
    void setUp() {
        System.out.println( "Dj set up" );
    }

    @Override
    void finish() {
        System.out.println( "Dj finish" );
    }

    @Override
    void playSong(String song) {
        System.out.println("Playing" + song);
    }
}
