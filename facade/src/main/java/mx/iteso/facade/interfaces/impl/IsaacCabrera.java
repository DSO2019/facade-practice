package mx.iteso.facade.interfaces.impl;
import mx.iteso.facade.interfaces.Photographer;
/**isaac cabrera es el fotografo. */
public class IsaacCabrera implements Photographer {
    /**turn on camera. */
    @Override
    public void turnOnCamera() {
        System.out.println("Turning camera on with the Isaac Cabrera");
    }
    /**turn off camera. */
    @Override
    public void turnOffCamera() {
        System.out.println("Turning camera off with the Isaac Cabrera");
    }
    /**take photo. */
    @Override
    public void takePhoto() {
        System.out.println("Isaac Cabrera taking a picture");
    }
    /**take video. */
    @Override
    public void takeVideo() {
        System.out.println("Isaac Cabrera taking a video");
    }
}
