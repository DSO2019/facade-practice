package mx.iteso.clases;

/** Mesas. */
public class Mesas implements mx.iteso.interfaces.Mesas {
  /**
     * Mesas .
     */
    private String mesas;
    /**
     * Constructor.
     */
    public Mesas() {
        mesas = "Madera";
    }
    /**
     * get Mesas.
     * @return string mesas.
     */
    public String getMesas() {
        return "Mesas de: " + mesas;
    }

    /**
     * set Mesas.
     * @param mesas String
     */
    public void setMesas(final String mesas) {
        this.mesas = mesas;
    }
}