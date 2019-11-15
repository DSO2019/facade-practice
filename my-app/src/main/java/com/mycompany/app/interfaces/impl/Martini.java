package com.mycompany.app.interfaces.impl;

import com.mycompany.app.interfaces.Bebida;

public class Martini implements Bebida {
    public void ordenar() {
        System.out.println("Ingredientes ordenados.");
    }
    public void servir() {
        System.out.println("Sirviendo Martini.");
    }
}
