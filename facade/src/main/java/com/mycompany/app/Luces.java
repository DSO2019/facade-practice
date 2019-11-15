package com.mycompany.app;

/**
 * El tipo de luz durante el evento.
 */
public class Luces implements com.mycompany.app.Interfaz.Luces {
    /**
     * Luces.
     */
    private String luces;
    /**
     * tipo de luces.
     */
    public Luces() {
        luces = "HUE RGB";
    }
    /**
     * getLuces.
     * @return nombre comida.
     */
    @Override
    public String getLuces() {
        return "Los focos que se utilizaran son:  " + luces;
    }

    /**
     * setLuces.
     * @param luces String
     */
    @Override
    public void setLuces(final String luces) {
    this.luces = luces;
    }
}
