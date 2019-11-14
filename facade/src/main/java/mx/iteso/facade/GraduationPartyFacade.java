package mx.iteso.facade;
import mx.iteso.facade.interfaces.Banquet;
import mx.iteso.facade.interfaces.DanceFloor;
import mx.iteso.facade.interfaces.DJ;
import mx.iteso.facade.interfaces.DrinksBar;
import mx.iteso.facade.interfaces.Lights;
import mx.iteso.facade.interfaces.MusicBox;
import mx.iteso.facade.interfaces.Photographer;
import mx.iteso.facade.interfaces.Security;
import mx.iteso.facade.interfaces.impl.Sepromex;
/**graduation party facade. */
public class GraduationPartyFacade {
    /**banquet. */
    private Banquet banquet;
    /**dance floor. */
    private DanceFloor danceFloor;
    /**dj. */
    private DJ dj;
    /**drinksbar. */
    private DrinksBar drinksBar;
    /**lights. */
    private Lights lights;
    /**musicbox. */
    private MusicBox musicBox;
    /**photographer. */
    private Photographer photographer;
    /**security. */
    private Security security;
    /**graduation party facade constructor.
     * @param mBanquet banquet.
     * @param mDanceFloor dance floor.
     * @param mDJ dj.
     * @param mDrinksBar drinks bar.
     * @param mLights lights.
     * @param mMusicBox music box.
     * @param mPhotographer photographer.
    */
    public GraduationPartyFacade(
        final Banquet mBanquet,
        final DanceFloor mDanceFloor,
        final DJ mDJ,
        final DrinksBar mDrinksBar,
        final Lights mLights,
        final MusicBox mMusicBox,
        final Photographer mPhotographer
    ) {
        this.banquet = mBanquet;
        this.danceFloor = mDanceFloor;
        this.dj = mDJ;
        this.drinksBar = mDrinksBar;
        this.lights = mLights;
        this.musicBox = mMusicBox;
        this.photographer = mPhotographer;
        this.security = new Sepromex();
    }
    /**start graduation party.
     * @param generation generation.
    */
    public void startGraduationParty(final String generation) {
        System.out.println("Starting graduation party for " + generation);
        this.security.organizeSecurity();
        this.musicBox.loadAllSongs();
        this.photographer.turnOnCamera();
        this.banquet.prepareBanquet();
        this.danceFloor.lightShow();
        this.drinksBar.prepareDrinks();
        this.lights.on();
        //wait till 11 pm
        this.dj.changeSong();
    }
}
