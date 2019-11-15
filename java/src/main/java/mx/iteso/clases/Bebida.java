package mx.iteso.clases;

/** Tequila Class. */
public class Tequila implements mx.iteso.interfaces.Comida  {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public Tequila(final String newName) {
        this.name = newName;
    }

    /** Return name.
     * @return name.
     */
    public String getBebida() {
        return this.name;
    }

    /** Serve. */
    public void serve() {
        System.out.println("Serving : " + this.name);
    }

}