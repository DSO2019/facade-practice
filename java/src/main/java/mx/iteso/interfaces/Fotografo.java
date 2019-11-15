package mx.iteso.interfaces;

/** Fotografo. */
public interface Fotografo {
    /** Get name.
     * @return name.
     */
    String getName();

    /** Take photos.
     * @param person person.
     */
    void takePhotos(Person person);
}