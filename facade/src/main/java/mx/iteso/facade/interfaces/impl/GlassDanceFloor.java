package mx.iteso.facade.interfaces.impl;

import mx.iteso.facade.interfaces.DanceFloor;
public class GlassDanceFloor implements DanceFloor {

    @Override
    public void changeColors() {
        System.out.println("Glass changing color");

    }

    @Override
    public void lightShow() {
        System.out.println("Turning light show on...");
    }

}
