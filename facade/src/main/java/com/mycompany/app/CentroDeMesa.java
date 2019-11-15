package com.mycompany.app;

/**
 * Centro de mesas en casa mesa.
 */
public class CentroDeMesa implements com.mycompany.app.Interfaz.CentroDeMesa {
    /**
     * CentroDeMesa.
     */
    private String CentroDeMesa;

    /**
     * Elección de CentroDeMesa.
     */
    public CentroDeMesa() {
        CentroDeMesa = "Arreglos Florales con luces de bengala";
    }
    /**
     * getCentroDeMesa.
     * @return centros de mesa str.
     */
    @Override
    public String getCentroDeMesa() {
        return "Los centros de mesas tendrán " + CentroDeMesa;
    }

    /**
     * setCentroDeMesa().
     * @param centroDeMesa String.
     */
    @Override
    public void setCentroDeMesa(final String centroDeMesa) {
        CentroDeMesa = centroDeMesa;
    }
}
