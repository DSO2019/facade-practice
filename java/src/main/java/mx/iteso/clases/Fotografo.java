package mx.iteso.clases;
;

/** Fotografo Class. */
public class Fotografo implements mx.iteso.interfaces.Fotografo {

    /** Name attribute. */
    private String name;

    /** Constructor.
     * @param newName name.
    */
    public Fotografo(final String nName) {
        this.name = nName;
    }

    /** Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /** Take photos method.
     * @param person person.
     */
    public void takePhotos(final Person person) {
        System.out.println("Snap  " + person.getName());
    }
}