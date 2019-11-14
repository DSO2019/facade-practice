package mx.iteso.facade.interfaces.impl;

import mx.iteso.facade.interfaces.Banquet;
public class GourmetBanquet implements Banquet {

    @Override
    public void prepareBanquet() {
        System.out.println("Preparing all the food...");

    }

    @Override
    public void servePlate() {
        System.out.println("Serving a plate of gourmet food...");

    }

}
