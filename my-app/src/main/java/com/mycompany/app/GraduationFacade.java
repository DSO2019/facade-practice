package com.mycompany.app;

/** Facade.*/
public interface GraduationFacade {
    
    Banda band;
    Bebidas drinks;
    Bouncer bouncer;
    Comediante comic;
    Comida food;
    DJ dj;
    Hostess host;
    ValetParking valet;

    public GraduationFacade(final Banda band1,
                            final Bouncer bouncer1,
                            final Comediante comic1,
                            final DJ dj1,
                            final Hostess host1,
                            final ValetParking valet1){
        this.band = band1;
        this.bouncer = bouncer1;
        this.comic = comic1;
        this.dj = dj1;
        this.host = host1;
        this.valet = valet1;
    }

    public startParty(String[] songs) {
        System.out.println("Llegando a la graduación");
        System.out.println();

        valet.parkCar();
        bouncer.checkGuestList();
        host.greet();
        host.showTable();
        comic.startStandUp();
        dj.setUp();
        band.setUp();

        food = new Sopa();
        food.serveFood();

        drinks = new Refresco();
        drinks.serveDrink();

        food = new Pollo();
        food.serveFood();

        drinks = new Vino();
        drinks.serveDrink();

        dj.playSong(songs[0]);
        band.playSong(songs[1]);
    }

    public finishParty() {
        
        comic.finishStandUp();
        dj.finish();
        band.finish();
        valet.returnCar();
        System.out.println("Salir de la graduación");
        
    }
}
