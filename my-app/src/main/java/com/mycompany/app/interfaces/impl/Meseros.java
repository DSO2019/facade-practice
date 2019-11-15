package com.mycompany.app.interfaces.impl;

import com.mycompany.app.interfaces.Servicio;

public class Meseros implements Servicio {
    public void contratar() {
        System.out.println("Meseros contratados.");
    }
    public void recibir() {
        System.out.println("Recibir y organizar meseros.");
    }
}
