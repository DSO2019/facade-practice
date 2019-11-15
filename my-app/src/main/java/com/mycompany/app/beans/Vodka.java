
package com.mycompany.app.beans;

import com.mycompany.app.interfaces.Drinks;

public class Vodka implements Drinks {

    private String name;

    public Vodka(String iName){
        this.name = iName;
    }

    public String getName(){
        return this.name;
    }
    
    public void serve(){
        System.out.println("Serving the vodka \""+this.getName()+" \", this started to smell like bad decisions.");
    }
}