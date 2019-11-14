package mx.iteso;

import mx.iteso.beans.*;

/**
 * Graduation Facade class.
 *
 */
public class Graduation {
    public static void main (String[] args) {
        Banners banner = new Banners("Class banners");
        Tequila tequila = new Tequila("Jose Cuervo");
        DancingRobots dancers = new DancingRobots("Light Show Robot Dancers");
        Pasta pasta = new Pasta("Fetuccini Alfredo");
        Dj dj = new Dj("Martin Garrix");
        Chips chips = new Chips("Sabritas");
        Benavento benavento = new Benavento("Benavento main hall");
        WaitingCrew waitingCrew = new WaitingCrew("Waiting Crew Members");
        GraduationFacade graduationFacade = new GraduationFacade(banner, tequila, dancers, pasta, dj, chips, benavento, waitingCrew);
    }
}