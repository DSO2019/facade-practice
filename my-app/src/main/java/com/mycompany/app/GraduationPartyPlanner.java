package com.mycompany.app;

/**
 * Clase para poder implementar facade.
 */
public final class GraduationPartyPlanner {
    /**
     * Para quitar checkstyle.
     */
    private GraduationPartyPlanner() {
    }

    /**
     * Es el main para crear.
     * @param args main
     */
    public static void main(final String[] args) {
        System.out.println("Le pedimos a una organizadora que nos "
+ "haga todo lo de "
+ "la fiesta y ella sugiere lo siguiente: ");
        System.out.println("===============================");
        BanqueteFancy banqueteFancy = new BanqueteFancy();
        BebidasFancy bebidasFancy = new BebidasFancy();
        InvitacionesFancy invitacionesFancy = new InvitacionesFancy();
        LugarFancy lugarFancy = new LugarFancy();
        MesasFancy mesasFancy = new MesasFancy();
        MusicaFancy musicaFancy = new MusicaFancy();
        PistaDeBaileFancy pistaDeBaileFancy = new PistaDeBaileFancy();
        SillaFancy sillaFancy = new SillaFancy();

        System.out.println(banqueteFancy.getTipoDeComida());
        System.out.println(bebidasFancy.getTipoDeBebida());
        System.out.println(invitacionesFancy.getTipoDeInvitaciones());
        System.out.println(lugarFancy.getTipoDelLugar());
        System.out.println(mesasFancy.getTipoDeMesas());
        System.out.println(musicaFancy.getTipoDeMusica());
        System.out.println(pistaDeBaileFancy.getTipoDePista());
        System.out.println(sillaFancy.getTipoDeSillas());

    }
}
