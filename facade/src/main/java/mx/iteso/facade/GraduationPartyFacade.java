package mx.iteso.facade;

import mx.iteso.facade.interfaces.*;

public class GraduationPartyFacade {
    private Banquet banquet;
    private DanceFloor danceFloor;
    private DJ dj;
    private DrinksBar drinksBar;
    private Lights lights;
    private MusicBox musicBox;
    private Photographer photographer;
    private Security security;


    public GraduationPartyFacade(
        Banquet mBanquet,
        DanceFloor mDanceFloor,
        DJ mDJ,
        DrinksBar mDrinksBar,
        Lights mLights,
        MusicBox mMusicBox,
        Photographer mPhotographer,
        Security mSecurity
    ){
        this.banquet = mBanquet;
        this.danceFloor = mDanceFloor;
        this.dj = mDJ;
        this.drinksBar = mDrinksBar;
        this.lights = mLights;
        this.musicBox = mMusicBox;
        this.photographer = mPhotographer;
        this.security = mSecurity;
    }

    public void startGraduationParty(String generation) {
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