package com.mycompany.app;

/**
 * Organizar party.
 */
public final class Party {
    /**
     * Cons Party.
     */
    private Party() {
    }

    /**
     * Crear party.
     * @param args main.
     */
    public static void main(final String[] args) {
        System.out.println("Recomenfaciones de la señora organizadora:");
        Luces luces = new Luces();
        Salon salon = new Salon();
        Mesas mesas = new Mesas();
        BanqueteComidas banqueteComidas = new BanqueteComidas();
        BanqueteBebidas banqueteBebidas = new BanqueteBebidas();
        SpotifyPremium spotifyPremiumFancy = new SpotifyPremium();
        EscenarioPrincipal escenarioPrincipal = new EscenarioPrincipal();
        CentroDeMesa centroDeMesa = new CentroDeMesa();

        System.out.println(luces.getLuces());
        System.out.println(salon.getSalon());
        System.out.println(mesas.getMesas());
        System.out.println(spotifyPremiumFancy.getSpotifyPremium());
        System.out.println(escenarioPrincipal.getEscenarioPrincipal());
        System.out.println(centroDeMesa.getCentroDeMesa());
        System.out.println(banqueteComidas.getBanqueteComida());
        System.out.println(banqueteBebidas.getBanqueteBebidas());


    }
}
