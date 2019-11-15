package com.mycompany.app.impl;

import com.mycompany.app.Comida;

/** Pollo.*/
public class Pollo implements Comida {
    /**Serve.*/
    @Override
    public void serveFood() {
        System.out.println("Sirviendo pollo");
    }
}
