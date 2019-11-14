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
}
