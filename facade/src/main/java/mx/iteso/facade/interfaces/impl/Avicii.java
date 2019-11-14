package mx.iteso.facade.interfaces.impl;
import mx.iteso.facade.interfaces.DJ;

/**Avicii implementa DJ. */
public class Avicii implements DJ {

    /**changeSong. */
    @Override
    public void changeSong() {
        System.out.println("Now playing Wake Me Up");
    }
    /**dropbeat. */
    @Override
    public void dropBeat() {
        System.out.println("OH SHIT.");
    }
}
