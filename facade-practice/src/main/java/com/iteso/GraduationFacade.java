package com.iteso;

import com.iteso.interfaces.Catering;
import com.iteso.interfaces.Chairs;
import com.iteso.interfaces.Clown;
import com.iteso.interfaces.Florist;
import com.iteso.interfaces.Music;
import com.iteso.interfaces.Invitations;
import com.iteso.interfaces.Tables;
import com.iteso.interfaces.Venue;
import com.iteso.interfaces.impl.Cepillin;
import com.iteso.interfaces.impl.Mexican;
import com.iteso.interfaces.impl.TulipGuy;
import com.iteso.interfaces.impl.WoodChairs;
import com.iteso.interfaces.impl.InvitationsGuy;
import com.iteso.interfaces.impl.Bandona;
import com.iteso.interfaces.impl.Terrace;
import com.iteso.interfaces.impl.WoodTables;


/**
 * Created by Beelzebub.
 */
public class GraduationFacade {
    /**
     * Catering.
     */
    private Catering catering;

    /**
     * Chairs.
     */
    private Chairs chairs;

    /**
     * Clown.
     */
    private Clown clown;

    /**
     * Florist.
     */
    private Florist florist;

    /**
     * Invitations.
     */
    private Invitations invitations;

    /**
     * Music.
     */
    private Music music;

    /**
     * Tables.
     */
    private Tables tables;

    /**
     * Venue.
     */
    private Venue venue;

    /**
     * Constructor.
     */
    public GraduationFacade() {
        catering = new Mexican();
        chairs = new WoodChairs();
        clown = new Cepillin();
        florist = new TulipGuy();
        invitations = new InvitationsGuy();
        music = new Bandona();
        tables = new WoodTables();
        venue = new Terrace();
    }

    /**
     * Getting ready.
     */
    public void getReady() {
        invitations.create("Ven a mis XV ya");
        invitations.send();
        florist.getOptions();
        chairs.placeChairs();
        tables.placeTables();
        florist.place();
    }

    /**
     * Party starts.
     */
    public void startParty() {
        venue.openDoors();
        clown.tellJoke();
        music.play();
        catering.serve();
        catering.clean();
        music.request("Pedido original by el Gallo de Oro");
        clown.dance();
    }

    /**
     * Party ends.
     */
    public void endParty() {
        music.request("Vete ya by el Gallo de Oro");
        clown.leave();
        music.stop();
        venue.closeDoors();
        catering.clean();
        chairs.removeChairs();
        tables.removeTables();
        florist.remove();
    }
}
