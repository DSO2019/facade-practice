package com.mycompany.app;

import com.mycompany.app.impl.CarlosBallarta;
import com.mycompany.app.impl.DJ1;
import com.mycompany.app.impl.Host;
import com.mycompany.app.impl.Security;
import com.mycompany.app.impl.TheStrokes;
import com.mycompany.app.impl.TheVoidz;
import com.mycompany.app.impl.Valet;


/**Driver.*/
final class App {

    /** App.*/
    private App() {

    }
    /**@param args .*/
    public static void main(final String[] args) {
        String[] songs1 = {"Song1", "Song2"};
        Comediante cb = new CarlosBallarta();
        DJ dj = new DJ1();
        Hostess host = new Host();
        Bouncer sec = new Security();
        Banda ts = new TheStrokes();
        Banda tv = new TheVoidz();
        ValetParking vp = new Valet();

        GraduationFacade facade = new GraduationFacade(ts,
            sec, cb, dj, host, vp);

        facade.startParty(songs1);
        facade.finishParty();

        facade = new GraduationFacade(tv, sec, cb, dj, host, vp);
        facade.startParty(songs1);
        facade.finishParty();
    }
}
