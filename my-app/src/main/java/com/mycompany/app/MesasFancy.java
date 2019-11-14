package com.mycompany.app;

import com.mycompany.app.Interfaz.IMesas;

/**
 * Que mesas vamos a contrar.
 */
public class MesasFancy implements IMesas {
    /**
     * Mesas del lugar.
     */
    private String mesas;

    /**
     * Constructor.
     */
    public MesasFancy() {
        mesas = "Las de plástica y metal";
    }
    /**
     * Getter.
     *
     * @return nombre mesas.
     */
    @Override
    public String getTipoDeMesas() {
        return "Las mesas que se utilizaran sera: " + mesas;
    }

    /**
     * Setter mesas.
     *
     * @param tipoDeMesas String
     */
    @Override
    public void setTipoDeMesas(final String tipoDeMesas) {
        mesas = tipoDeMesas;
    }
}
