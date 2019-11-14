package mx.iteso.facade.implementations;

import mx.iteso.facade.interfaces.IDJ;

public class DJ implements IDJ {

    public void playMusic() {
        System.out.println("DJ starts playing music.");
    }

    public void stopMusic() {
        System.out.println("DJ stops playing music.");
    }
}
