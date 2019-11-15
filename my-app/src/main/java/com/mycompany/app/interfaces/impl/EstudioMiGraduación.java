package com.mycompany.app.interfaces.impl;

import com.mycompany.app.interfaces.EstudioFotográfico;

public class EstudioMiGraduación implements EstudioFotográfico {
    public void contratar() {
        System.out.println("Estudio Mi Graduación, contratado.");
    }
    public void recibir() {
        System.out.println("Recibir y ubicar a staff del estudio.");
    }
}
