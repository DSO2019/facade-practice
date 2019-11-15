package mx.iteso.facade;

import mx.iteso.facade.impl.Attendant;
import mx.iteso.facade.impl.Grad;
import mx.iteso.facade.impl.Organizer;

public class GradParty {
    Person angela = new Organizer("Angela");
    Person juan = new Grad("Juan", 2019);
    Person gabriela = new Grad("Gabriela", 2019);
    Person oscar = new Attendant("Oscar");
    Person maria = new Attendant("Maria");
    Person ivan = new Attendant("Ivan");

    Event gradParty = new Event() {
    }

}
