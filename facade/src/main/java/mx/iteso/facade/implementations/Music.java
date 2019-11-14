package mx.iteso.facade.implementations;

import mx.iteso.facade.interfaces.IMusic;

public class Music implements IMusic {

    public void playMusic() {
        System.out.println("Music starts.");
    }

    public void stopMusic() {
        System.out.println("Music stops.");
    }
}
