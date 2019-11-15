package mx.iteso.clases;

/** Sonido. */
public class Sonido  implements mx.iteso.interfaces.Sonido {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public Sonido(final String nName) {
        this.name = nName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /** Play. */
    public void play() {
        System.out.println(this.name + " playing music");
    }

    /** Stop. */
    public void stop() {
        System.out.println(this.name + " stoping music");
    }
}