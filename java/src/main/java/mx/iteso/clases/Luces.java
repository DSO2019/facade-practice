package mx.iteso.clases;

/** Luces. */
public class Luces implements mx.iteso.interfaces.Luces {
 /**
     * Luces.
     */
    private String luces;
    /**
     * luces.
     */
    public Luces() {
        luces = "LED";
    }
    /**
     * getLuces.
     * @return luces .
     */
    @Override
    public String getLuces() {
        return "Las luces son:  " + luces;
    }

    /**
     * setLuces.
     * @param luces String
     */
    @Override
    public void setLuces(final String luces) {
    this.luces = luces;
    }
}