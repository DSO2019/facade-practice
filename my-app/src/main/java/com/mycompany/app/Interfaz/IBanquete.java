package com.mycompany.app.Interfaz;

/**
 * Para la comida del lugar.
 */
public interface IBanquete {
    /**
     * Getter.
     * @return nombre comida.
     */
    String getTipoDeComida();

    /**
     * Setter comida.
     * @param tipoDeComida String
     */
    void setTipoDeComida(String tipoDeComida);
}
