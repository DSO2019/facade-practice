package mx.iteso.facade.interfaces.impl;
import mx.iteso.facade.interfaces.DanceFloor;
/**Glass dance floor. */
public class GlassDanceFloor implements DanceFloor {
    /**changeColors. */
    @Override
    public void changeColors() {
        System.out.println("Glass changing color");

    }
    /**lightShow. */
    @Override
    public void lightShow() {
        System.out.println("Turning light show on...");
    }
}
