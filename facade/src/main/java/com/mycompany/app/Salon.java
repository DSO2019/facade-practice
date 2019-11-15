package com.mycompany.app;

/**
 * Salon a elegir.
 */
public class Salon implements com.mycompany.app.Interfaz.Salon {
    /**
     * El lugar.
     */
    private String salon;

    /**
     * Tipo de salon.
     */
    public Salon() {
        salon = "Corona";
    }
    /**
     * getSalon().
     * @return nombre salon.
     */
    @Override
    public String getSalon() {
        return "El nombre del salon es: " + salon;
    }

    /**
     * setSalon().
     * @param salon String
     */
    @Override
    public void setSalon(final String salon) {
        this.salon = salon;
    }
}
