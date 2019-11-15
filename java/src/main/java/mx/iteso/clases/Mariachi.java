package mx.iteso.clases;

/** Mariachi. */
public class Mariachi implements mx.iteso.interfaces.Mariachi {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public Mariachi(final String nName) {
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
        System.out.println(this.name + " playing mariachi");
    }

    /** Stop. */
    public void stop() {
        System.out.println(this.name + " stoping mariachi");
    }
}