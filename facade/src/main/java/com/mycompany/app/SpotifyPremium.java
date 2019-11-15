package com.mycompany.app;

/**
 * Membresia Spotify para musica.
 */
public class SpotifyPremium implements com.mycompany.app.Interfaz.SpotifyPremium {
    /**
     * Tipo de membresia.
     */
    private String spotify;

    /**
     * SpotifyPremium.
     */
    public SpotifyPremium() {
        spotify = "Spotify Premium sin anuncios";
    }
    /**
     * getSpotifyPremium.
     * @return tipo de membresia.
     */
    @Override
    public String getSpotifyPremium() {
        return "Tipo de membresia spotify: " + spotify;
    }

    /**
     * setSpotifyPremium.
     * @param spotifyPremium String
     */
    @Override
    public void setSpotifyPremium(final String spotifyPremium) {
        spotify = spotifyPremium;
    }
}
