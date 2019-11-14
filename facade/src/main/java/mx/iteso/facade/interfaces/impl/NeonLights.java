package mx.iteso.facade.interfaces.impl;
import mx.iteso.facade.interfaces.Lights;
/**Neon lights class. */
public class NeonLights implements Lights {
    /**turn on. */
    @Override
    public void on() {
        System.out.println("Turning neon lights on");
    }
    /**turn off. */
    @Override
    public void off() {
        System.out.println("Turning neon lights off");
    }
}
