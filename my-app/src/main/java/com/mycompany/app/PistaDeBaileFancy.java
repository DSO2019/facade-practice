package com.mycompany.app;

import com.mycompany.app.Interfaz.IPistaDeBaile;

/**
 * La pista de baile.
 */
public class PistaDeBaileFancy implements IPistaDeBaile {
    /**
     * Donde vamos a bailar.
     */
    private String pista;

    /**
     * Constructor.
     */
    public PistaDeBaileFancy() {
        pista = "las cabañas";
    }
    /**
     * Getter.
     *
     * @return nombre pista de baile.
     */
    @Override
    public String getTipoDePista() {
        return "La pista de baile que se eligio fue: " + pista;
    }

    /**
     * Setter comida.
     *
     * @param tipoDePista String
     */
    @Override
    public void setTipoDePista(final String tipoDePista) {
        pista = tipoDePista;
    }
}
