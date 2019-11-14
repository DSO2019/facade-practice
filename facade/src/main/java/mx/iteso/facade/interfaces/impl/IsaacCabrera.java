package mx.iteso.facade.interfaces.impl;

import mx.iteso.facade.interfaces.Photographer;
public class IsaacCabrera implements Photographer {

    @Override
    public void turnOnCamera() {
        System.out.println("Turning camera on with the one and only Isaac Cabrera");

    }

    @Override
    public void turnOffCamera() {
        System.out.println("Turning camera off with the one and only Isaac Cabrera");

    }

    @Override
    public void takePhoto() {
        System.out.println("Isaac Cabrera taking a picture");

    }

    @Override
    public void takeVideo() {
        System.out.println("Isaac Cabrera taking a video");

    }

}
