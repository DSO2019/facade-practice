package com.mycompany.app;

/**
 * EscenarioPrincipal de eventos y bailes.
 */
public class EscenarioPrincipal implements com.mycompany.app.Interfaz.EscenarioPrincipal {
    /**
     * escenario.
     */
    private String escenario;

    /**
     * EscenarioPrincipal().
     */
    public EscenarioPrincipal() {
        escenario = "Pista con Luces";
    }
    /**
     * getEscenarioPrincipal.
     *
     * @return nombre de pista.
     */
    @Override
    public String getEscenarioPrincipal() {
        return "El escenario principal es: " + escenario;
    }

    /**
     * Setter setEscenarioPrincipal.
     *
     * @param escenarioPrincipal String
     */
    @Override
    public void setEscenarioPrincipal(final String escenarioPrincipal) {
        escenario = escenarioPrincipal;
    }
}
