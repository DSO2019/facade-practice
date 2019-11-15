package com.mycompany.app.impl;

import com.mycompany.app.Comida;

/** Sopa.*/
public class Sopa implements Comida {
    @Override
    void serveFood() {
        System.out.println("Sirviendo sopa");
    }
}
