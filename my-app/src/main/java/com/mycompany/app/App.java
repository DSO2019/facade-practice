package com.mycompany.app;

import com.mycompany.app.*;
import com.mycompany.app.impl.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Comediante cb = new CarlosBallarta();
        DJ dj = new DJ1();
        Hostess host = new Host();
        Bouncer sec = new Security();
        Banda ts = new TheStrokes();
        Banda tv = new TheVoidz();
        ValetParking vp = new Valet();

        GraduationFacade facade = new GraduationFacade(ts,sec,cb,dj,host,vp);
        facade.startParty(["Song1","Song2"]);
        facade.finishParty();

        facade = new GraduationFacade(tv,sec,cb,dj,host,vp);
        facade.startParty(["Song1","Song2"]);
        facade.finishParty();
    }
}
