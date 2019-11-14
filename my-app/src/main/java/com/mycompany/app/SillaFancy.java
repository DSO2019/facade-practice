package com.mycompany.app;

import com.mycompany.app.Interfaz.ISillas;

/**
 * Para ver que sillas se van a poner.
 */
public class SillaFancy implements ISillas {
    /**
     * Sillas a elegir.
     */
    private String sillas;

    /**
     * Constructor.
     */
    public SillaFancy() {
        sillas = "las de cristal";
    }
    /**
     * Getter.
     *
     * @return nombre sillas.
     */
    @Override
    public String getTipoDeSillas() {
        return "Las sillas que se eligieron fueron: " + sillas;
    }

    /**
     * Setter comida.
     *
     * @param tipoDeSillas String
     */
    @Override
    public void setTipoDeSillas(final String tipoDeSillas) {
        sillas = tipoDeSillas;
    }
}
