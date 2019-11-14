package mx.iteso.facade.implementations;

import mx.iteso.facade.interfaces.ISecurity;

public class Security implements ISecurity {

    public void installSecurity() {
        System.out.println("Install security.");
    }

    public void removeSecurity() {
        System.out.println("Remove security.");
    }
}
