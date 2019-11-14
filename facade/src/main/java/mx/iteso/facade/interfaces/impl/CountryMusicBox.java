package mx.iteso.facade.interfaces.impl;

import mx.iteso.facade.interfaces.MusicBox;
public class CountryMusicBox implements MusicBox {

    @Override
    public void loadAllSongs() {
        System.out.println("Loading songs...");
        System.out.println("All songs loaded!");
    }

    @Override
    public void changeSong() {
        System.out.println("Changing song");
    }
}
