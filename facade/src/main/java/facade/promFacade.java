package facade;


import facade.interfaces.*;

public class promFacade {
    Food food;
    Drinks drinks;
    Music music;
    Tables tables;
    Chairs chairs;
    DanceFloor danceFloor;
    Waitress waitress;
    Location location;

    public promFacade(Food food, Drinks drinks, Music music, Tables tables, Chairs chairs, DanceFloor danceFloor, Waitress waitress, Location location) {
        this.food = food;
        this.drinks = drinks;
        this.music = music;
        this.tables = tables;
        this.chairs = chairs;
        this.danceFloor = danceFloor;
        this.waitress = waitress;
        this.location = location;
    }


}
