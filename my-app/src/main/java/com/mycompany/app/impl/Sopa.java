package com.mycompany.app.impl;

import com.mycompany.app.Comida;

/** Sopa.*/
public class Sopa implements Comida {
    /**Serve.*/
    @Override
    public void serveFood() {
        System.out.println("Sirviendo sopa");
    }
}
