package mx.iteso.facade;
/**
 * Driver class.
 */
public class Driver {
    /**
     * Main method.
     * @param args args.
     */
    public static void main (final String[] args) {
        /**
         * Chair.
         */
        AluminumChair chair = new AluminumChair();
        /**
         * Event place.
         */
        Benavento benavento = new Benavento();
        /**
         * Candy bar.
         */
        DeLaRosa dlr = new DeLaRosa();
        /**
         * Photographer.
         */
        Gerardo gerardo = new Gerardo();
        /**
         * Waiter.
         */
        Juan juan = new Juan();
        /**
         * Dj.
         */
        Khalid dj = new Khalid();
        /**
         * Lights.
         */
        PartyLights lights = new PartyLights();
        /**
         * Table.
         */
        RoundTable table = new RoundTable();
        /**
         * Facade.
         */
        GraduationFacade facade = new GraduationFacade(dlr,
                                                        chair,
                                                        dj,
                                                        benavento,
                                                        lights,
                                                        gerardo,
                                                        table,
                                                        juan);
        facade.startGraduationParty();
        facade.stopGraduationParty();
    }
}
