package mx.iteso.facade.ints.impl;
/**
 * Benavento class.
 */
public class Benavento implements EventPlace {
    /**
     * Open event place.
     */
    void open() {
        System.out.println("Opening Benavento.");
    }
    /**
     * Close event place.
     */
    void close() {
        System.out.println("Closing Benavento.");
    }
}
