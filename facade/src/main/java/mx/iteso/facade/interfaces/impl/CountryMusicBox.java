package mx.iteso.facade.interfaces.impl;
import mx.iteso.facade.interfaces.MusicBox;
/**Country Music Box implements Music Box. */
public class CountryMusicBox implements MusicBox {
    /**loadAllSongs. */
    @Override
    public void loadAllSongs() {
        System.out.println("Loading songs...");
        System.out.println("All songs loaded!");
    }
    /**changeSong. */
    @Override
    public void changeSong() {
        System.out.println("Changing song");
    }
}
