package mx.iteso.facade.ints;
/**
 * Graduation Facade class.
 */
public class GraduationFacade {
    /**
     * Candy bar.
     */
    private CandyBar candyBar;
    /**
     * Chairs.
     */
    private Chairs chairs;
    /**
     * Dj.
     */
    private Dj dj;
    /**
     * Event Place.
     */
    private EventPlace eventPlace;
    /**
     * Lights.
     */
    private Lights lights;
    /**
     * Photographer.
     */
    private Photographer photographer;
    /**
     * Tables.
     */
    private Tables tables;
    /**
     * Waiters.
     */
    private Waiters waiters;
    /**
     * Constructor.
     * @param cb candyBar.
     * @param c chairs.
     * @param djay dj.
     * @param eP event place.
     * @param l lights.
     * @param p photographer.
     * @param t tables.
     * @param w waiters.
     */
    public GraduationFacade(final CandyBar cb,
                            final Chairs c,
                            final Dj djay,
                            final EventPlace eP,
                            final Lights l,
                            final Photographer p,
                            final Tables t,
                            final Waiters w) {
        this.candyBar = cb;
        this.chairs = c;
        this.dj = djay;
        this.eventPlace = eP;
        this.lights = l;
        this.photographer = p;
        this.tables = t;
        this.waiters = w;
    }
    /**
     * Start Graduation Party.
     */
    public void startGraduationParty() {
        candyBar.stock();
        candyBar.open();
        chairs.unfold();
        dj.playMusic();
        eventPlace.open();
        lights.off();
        photographer.takePhoto();
        tables.unfold();
        waiters.serve();
    }
    /**
     * Stop Graduation Party.
     */
    public void stopGraduationParty() {
        candyBar.close();
        chairs.fold();
        dj.stopMusic();
        eventPlace.close();
        lights.on();
        photographer.putCameraAway();
        tables.fold();
        waiters.clean();
    }
}
