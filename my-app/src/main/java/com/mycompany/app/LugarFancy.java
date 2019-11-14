package com.mycompany.app;

import com.mycompany.app.Interfaz.ILugar;

/**
 * Donde sera el lugar.
 */
public class LugarFancy implements ILugar {
    /**
     * El lugar.
     */
    private String lugar;

    /**
     * Constructor.
     */
    public LugarFancy() {
        lugar = "chapultepec";
    }
    /**
     * Getter.
     *
     * @return nombre del lugar.
     */
    @Override
    public String getTipoDelLugar() {
        return "El lugar sera: " +  lugar;
    }

    /**
     * Setter lugar.
     *
     * @param tipoDelLugar String
     */
    @Override
    public void setTipoDelLugar(final String tipoDelLugar) {
        lugar = tipoDelLugar;
    }
}
