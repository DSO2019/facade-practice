package mx.iteso.facade.implementations;

import mx.iteso.facade.interfaces.IBanquet;

public class Banquet implements IBanquet {

    public void serveFood() {
        System.out.println("Server food");
    }

    public void removePlates() {
        System.out.println("Remove plates");
    }
}
