package mx.iteso.facade.interfaces.impl;
import mx.iteso.facade.interfaces.Banquet;
/**Gourmet Banquet. */
public class GourmetBanquet implements Banquet {
    /**prepare banquet. */
    @Override
    public void prepareBanquet() {
        System.out.println("Preparing all the food...");

    }
    /**serve plate. */
    @Override
    public void servePlate() {
        System.out.println("Serving a plate of gourmet food...");
    }
}
