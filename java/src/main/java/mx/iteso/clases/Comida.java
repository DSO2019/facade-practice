package mx.iteso.clases;

/** Comida. */
public class Pollo implements mx.iteso.interfaces.Comida {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public Pollo(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /** Serve. */
    public void serve() {
        System.out.println("Serving : " + this.name);
    }

}