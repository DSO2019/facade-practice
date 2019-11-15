package mx.iteso.clases;

/** Dj Class. */
public class DJ implements mx.iteso.interfaces.DJ {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public DJ(final String nName) {
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
        System.out.println(this.name + " playing");
    }

    /** Stop. */
    public void stop() {
        System.out.println(this.name + " stoping");
    }
}