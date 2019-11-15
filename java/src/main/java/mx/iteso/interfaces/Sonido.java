package mx.iteso.interfaces;

/** Sonido. */
public interface Sonido {
    /** Get Sonido.
     * @return Sonido.
     */
    String getName();

    /** Play. */
    void play();

    /** Stop. */
    void stop();
}