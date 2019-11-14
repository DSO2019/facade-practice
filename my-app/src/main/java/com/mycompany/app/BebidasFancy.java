package com.mycompany.app;

import com.mycompany.app.Interfaz.IBebidas;

/**
 * Bebidas a dar en la fiesta.
 */
public class BebidasFancy implements IBebidas {
    /**
     * Bebida a servir en la fiesta.
     */
    private String bebida;

    /**
     * Constructor.
     */
    public BebidasFancy() {
        bebida = "Coca-cola";
    }
    /**
     * Getter.
     *
     * @return nombre comida.
     */
    @Override
    public String getTipoDeBebida() {
        return "La bebida que se va a servir es : " + bebida;
    }

    /**
     * Setter comida.
     *
     * @param tipoDeBebida String
     */
    @Override
    public void setTipoDeBebida(final String tipoDeBebida) {
        bebida = tipoDeBebida;
    }
}
