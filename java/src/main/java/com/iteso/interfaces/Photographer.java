package com.iteso.interfaces;

/** Photographer. */
public interface Photographer {
    /** Get name.
     * @return name.
     */
    String getName();

    /** Take photos.
     * @param person person.
     */
    void takePhotos(Person person);
}
