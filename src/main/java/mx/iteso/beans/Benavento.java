package mx.iteso.beans;

import mx.iteso.interfaces.Venue;

public class Benavento implements Venue {

    private String name;
    private boolean busy;

    public Benavento(String incomingName){
        this.name = incomingName;
        this.busy = false;
    }

    public String getName(){
        return this.name;
    }

    public boolean isBusy(){
        return this.busy;
    }
    
    public void openVenue(){
        System.out.println(this.getName()+" is now open and ready to host the party.");
        this.busy = true;
    }
}