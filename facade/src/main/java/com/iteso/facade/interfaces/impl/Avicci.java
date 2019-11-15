package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.DJ;

public class Avicci implements DJ{

    @Override
    public void startMusic(){
        System.out.print("Tss Tss Pum Pom");
    };

    public void dropBass(){
        System.out.print("Waaaah ...... Yeah!");
    };

    public void stopMusic(){
        System.out.print("El payaso de rodeo");
    };
}