package mx.iteso.facade.interfaces.impl;
import mx.iteso.facade.interfaces.Security;
/**sepromex. */
public class Sepromex implements Security {
    /**fight. */
    @Override
    public void fight() {
        System.out.println("FIGHT!");
    }
    /**organize security. */
    @Override
    public void organizeSecurity() {
        System.out.println("Organizing security with SEPROMEX");
    }
}
