package com.mycompany.app;

import com.mycompany.app.Interfaz.IInvitaciones;

/**
 * Las invitaciones que se van a dar.
 */
public class InvitacionesFancy implements IInvitaciones {
    /**
     * Tipo de papel para invitaciones.
     */
    private String invitaciones;
    /**
     * Constructor.
     */
    public InvitacionesFancy() {
        invitaciones = "papel reciclado";
    }
    /**
     * Getter.
     *
     * @return nombre comida.
     */
    @Override
    public String getTipoDeInvitaciones() {
        return "Las invitaciones seran de " + invitaciones;
    }

    /**
     * Setter comida.
     *
     * @param tipoDeInvitaciones String
     */
    @Override
    public void setTipoDeInvitaciones(final String tipoDeInvitaciones) {
    invitaciones = tipoDeInvitaciones;
    }
}
