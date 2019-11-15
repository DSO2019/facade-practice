package com.mycompany.app.interfaces.impl;

import com.mycompany.app.interfaces.Salón;

public class SalónInternacional implements Salón {
    public void rentar() {
        System.out.println("Salón internacional rentado.");
    }
    public void acondicionar() {
        System.out.println("Preparando Salón internacional.");
    }
}
