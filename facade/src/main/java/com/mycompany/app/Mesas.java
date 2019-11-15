package com.mycompany.app;

/**
 * Tipo de mesas.
 */
public class Mesas implements com.mycompany.app.Interfaz.Mesas {
    /**
     * Mesas tipo.
     */
    private String mesas;

    /**
     * Constructor.
     */
    public Mesas() {
        mesas = "De Coca Cola";
    }
    /**
     * getMesas.
     * @return string mesas.
     */
    @Override
    public String getMesas() {
        return "Las mesas seran de tipo: " + mesas;
    }

    /**
     * setMesas.
     * @param mesas String
     */
    @Override
    public void setMesas(final String mesas) {
        this.mesas = mesas;
    }
}
