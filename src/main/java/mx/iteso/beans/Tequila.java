package mx.iteso.beans;

import mx.iteso.interfaces.Drinks;

public class Tequila implements Drinks {

    private String name;

    public Tequila(String incomingName){
        this.name = incomingName;
    }

    public String getName(){
        return this.name;
    }
    
    public void serve(){
        System.out.println("Serving "+this.getName()+" tequila.");
    }
}