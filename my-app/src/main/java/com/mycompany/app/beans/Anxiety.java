
package com.mycompany.app.beans;

import com.mycompany.app.interfaces.MentalDisorders;

public class Anxiety implements MentalDisorders {

    private String name;

    public Anxiety(String iName){
        this.name = iName;
    }

    public String getName(){
        return this.name;
    }
    
    public void showTerribleSymptoms(){
        System.out.println("Oh boy! of course you and \""+this.getName()+" \" can come to the graduation. You two are inseparable!");
    }
}