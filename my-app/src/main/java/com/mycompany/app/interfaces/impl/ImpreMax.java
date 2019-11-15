package com.mycompany.app.interfaces.impl;

import com.mycompany.app.interfaces.Imprenta;

public class ImpreMax implements Imprenta {
    public void contratar() {
        System.out.println("ImpreMax contratado.");
    }
    public void distribuirInvitaciones() {
        System.out.println("Invitaciones enviadas.");
    }
}
