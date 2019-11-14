package com.mycompany.app;

import com.mycompany.app.Interfaz.IBanquete;

/**
 * Lo que se va a servir en el banquete.
 */
public class BanqueteFancy implements IBanquete {
    /**
     * Variables a utilizar.
     * Tipo de comida a servir.
     */
    private String tipoDeComida;

    /**
     * Constructor.
     */
    public BanqueteFancy() {
        tipoDeComida = "Pozole";
    }
    /**
     * Que comida se va a servir.
     *
     * @return nombre comida.
     */
    public String getTipoDeComida() {
        return "La comida que se va a servir es: " + tipoDeComida;
    }

    /**
     * Setter comida.
     * @param comidaSet Actulizar comida
     */
    public void setTipoDeComida(final String comidaSet) {
        tipoDeComida = comidaSet;
    }

}
