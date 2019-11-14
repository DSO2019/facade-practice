package mx.iteso.facade.implementations;

import mx.iteso.facade.interfaces.IMariachi;

public class Mariachi  implements IMariachi {

    public void startMariachi() {
        System.out.println("Mariachi starts.");
    }

    public void stopMariachi() {
        System.out.println("Mariachi stops.");
    }
}
