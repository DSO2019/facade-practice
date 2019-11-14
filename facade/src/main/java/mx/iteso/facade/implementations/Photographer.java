package mx.iteso.facade.implementations;

import mx.iteso.facade.interfaces.IPhotographer;

public class Photographer  implements IPhotographer {

    public void startSession() {
        System.out.println("Starts photo session.");
    }

    public void stopSession() {
        System.out.println("Stops photo session.");
    }
}
