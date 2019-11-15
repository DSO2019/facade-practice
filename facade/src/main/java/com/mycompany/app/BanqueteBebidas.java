package com.mycompany.app;

/**
 * BanqueteBebidas().
 */
public class BanqueteBebidas implements com.mycompany.app.Interfaz.BanqueteBebidas {
    /**
     * Bebida a servir en la fiesta.
     */
    private String bebidas;

    /**
     * bebida para tomar en el banquete.
     */
    public BanqueteBebidas() {
        bebidas = "Negra-Modelo";
    }
    /**
     * Getter String Bebidas.
     * @return bebidas.
     */
    @Override
    public String getBanqueteBebidas() {
        return "En el banquete habra de bebida:  " + bebidas;
    }

    /**
     * Setter String Bebidas.
     * @param banqueteBebidas String
     */
    @Override
    public void setBanqueteBebidas(final String banqueteBebidas) {
        bebidas = banqueteBebidas;
    }
}
