package mx.iteso.facade.implementations;

import mx.iteso.facade.interfaces.IDanceFloor;

public class DanceFloor implements IDanceFloor {

    public void installFloor() {
        System.out.println("Install dance floor.");
    }

    public void retireFloor() {
        System.out.println("Remove dance floor.");
    }
}
