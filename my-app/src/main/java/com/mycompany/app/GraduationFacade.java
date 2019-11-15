package com.mycompany.app;

import com.mycompany.app.impl.Sopa;
import com.mycompany.app.impl.Pollo;
import com.mycompany.app.impl.Vino;
import com.mycompany.app.impl.Refresco;

/** Facade. */
public class GraduationFacade {
    /** band.*/
    private Banda band;
    /** drinks.*/
    private Bebidas drinks;
    /** boucer.*/
    private Bouncer bouncer;
    /** comic.*/
    private Comediante comic;
    /** food.*/
    private Comida food;
    /** dj.*/
    private DJ dj;
    /** host.*/
    private Hostess host;
    /** valet.*/
    private ValetParking valet;

    /**Constructor.
     * @param band1 .
     * @param bouncer1 .
     * @param comic1 .
     * @param dj1 .
     * @param host1 .
     * @param valet1 .
     * .*/
    public GraduationFacade(final Banda band1,
                            final Bouncer bouncer1,
                            final Comediante comic1,
                            final DJ dj1,
                            final Hostess host1,
                            final ValetParking valet1) {
        this.band = band1;
        this.bouncer = bouncer1;
        this.comic = comic1;
        this.dj = dj1;
        this.host = host1;
        this.valet = valet1;
    }

    /**@param songs .*/
    public void startParty(final String[] songs) {
        System.out.println("Llegando a la graduación");
        System.out.println();

        valet.parkCar();
        bouncer.checkGuestList();
        host.greet();
        host.showTable();
        comic.startStandUp();
        comic.joke();
        dj.setUp();
        dj.playSong(songs[0]);
        band.setUp();
        band.playSong(songs[1]);

        food = new Sopa();
        food.serveFood();

        drinks = new Refresco();
        drinks.serveDrink();

        food = new Pollo();
        food.serveFood();

        drinks = new Vino();
        drinks.serveDrink();
    }

    /**Finish.*/
    public void finishParty() {

        comic.finishStandUp();
        dj.finish();
        band.finish();
        valet.returnCar();
        System.out.println("Salir de la graduación");
    }
}
