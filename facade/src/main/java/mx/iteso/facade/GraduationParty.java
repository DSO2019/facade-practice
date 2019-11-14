package mx.iteso.facade;

import mx.iteso.facade.implementations.*;

public class GraduationParty {
    private Banquet banquet;
    private DanceFloor danceFloor;
    private DJ dj;
    private DrinksBar drinksBar;
    private Mariachi mariachi;
    private Music music;
    private Photographer photographer;
    private Security security;

    public GraduationParty(Banquet nBanquet,
                           DanceFloor nDanceFloor,
                           DJ nDj,
                           DrinksBar nDrinksBar,
                           Mariachi nMariachi,
                           Music nMusic,
                           Photographer nPhotographer,
                           Security nSecurity) {
        this.banquet = nBanquet;
        this.danceFloor = nDanceFloor;
        this.dj = nDj;
        this.drinksBar = nDrinksBar;
        this.mariachi = nMariachi;
        this.music = nMusic;
        this.photographer = nPhotographer;
        this.security = nSecurity;
    }

    public void startGraduationParty() {
        security.installSecurity();
        danceFloor.installFloor();
        drinksBar.startDrinksBar();
        music.playMusic();
        banquet.serveFood();
        photographer.startSession();
        banquet.removePlates();
        photographer.stopSession();
        dj.playMusic();
        dj.stopMusic();
        mariachi.startMariachi();
        mariachi.stopMariachi();
    }

    public void stopGraduationParty() {
        drinksBar.stopDrinksBar();
        music.stopMusic();
        danceFloor.retireFloor();
        security.removeSecurity();
    }
}
