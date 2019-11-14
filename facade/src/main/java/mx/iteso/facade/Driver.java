package mx.iteso.facade;
import mx.iteso.facade.interfaces.*;
import mx.iteso.facade.interfaces.impl.*;

public class Driver {

    public static void main(String[] args) {
        Banquet banquet = new GourmetBanquet();
        DanceFloor dFloor = new GlassDanceFloor();
        DJ avicii = new Avicii();
        DrinksBar drinksBar = new FullAlcoholDrinksBar();
        Lights lights = new NeonLights();
        MusicBox rockola = new CountryMusicBox();
        Photographer isaac = new IsaacCabrera();
        Security security = new Sepromex();

        GraduationPartyFacade gradParty = new GraduationPartyFacade(
            banquet,
            dFloor,
            avicii,
            drinksBar,
            lights,
            rockola,
            isaac,
            security);
        
            gradParty.startGraduationParty("ISC 2020 Otoño");
    }
}