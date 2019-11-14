package mx.iteso.facade.interfaces.impl;

import mx.iteso.facade.interfaces.Lights;
public class NeonLights implements Lights {

    @Override
    public void on() {
        System.out.println("Turning neon lights on");

    }

    @Override
    public void off() {
        System.out.println("Turning neon lights off");
    }

}
