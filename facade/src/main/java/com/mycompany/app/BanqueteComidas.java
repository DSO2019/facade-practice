package com.mycompany.app;

/**
 * Banquete comidas.
 */
public class BanqueteComidas implements com.mycompany.app.Interfaz.BanqueteComida {
    /**
     * Comidas del banquete.
     */
    private String banqueteComidas;

    /**
     * Comidas.
     */
    public BanqueteComidas() {
        banqueteComidas = "Langosta";
    }
    /**
     * Comida Banquete.
     * @return comida str.
     */
    public String getBanqueteComida() {
        return "En el banquete habra de comida:  " + banqueteComidas;
    }

    /**
     * setBanqueteComida.
     * @param banqueteComida Actulizar comida
     */
    public void setBanqueteComida(final String banqueteComida) {
        banqueteComidas = banqueteComida;
    }

}
