package mx.iteso.facade;
import mx.iteso.facade.interfaces.Banquet;
import mx.iteso.facade.interfaces.DanceFloor;
import mx.iteso.facade.interfaces.DJ;
import mx.iteso.facade.interfaces.DrinksBar;
import mx.iteso.facade.interfaces.Lights;
import mx.iteso.facade.interfaces.MusicBox;
import mx.iteso.facade.interfaces.Photographer;

import mx.iteso.facade.interfaces.impl.GourmetBanquet;
import mx.iteso.facade.interfaces.impl.GlassDanceFloor;
import mx.iteso.facade.interfaces.impl.Avicii;
import mx.iteso.facade.interfaces.impl.FullAlcoholDrinksBar;
import mx.iteso.facade.interfaces.impl.NeonLights;
import mx.iteso.facade.interfaces.impl.CountryMusicBox;
import mx.iteso.facade.interfaces.impl.IsaacCabrera;
/**Driver class. */
public final class Driver {
    /**Private constructor. */
    private Driver() {

    }
    /**main.
     * @param args arguments.
     * */
    public static void main(final String[] args) {
        Banquet banquet = new GourmetBanquet();
        DanceFloor dFloor = new GlassDanceFloor();
        DJ avicii = new Avicii();
        DrinksBar drinksBar = new FullAlcoholDrinksBar();
        Lights lights = new NeonLights();
        MusicBox rockola = new CountryMusicBox();
        Photographer isaac = new IsaacCabrera();

        GraduationPartyFacade gradParty = new GraduationPartyFacade(
            banquet,
            dFloor,
            avicii,
            drinksBar,
            lights,
            rockola,
            isaac);
            gradParty.startGraduationParty("ISC 2020 Otoño");
    }
}
