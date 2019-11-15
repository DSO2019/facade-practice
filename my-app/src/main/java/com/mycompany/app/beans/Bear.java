
package com.mycompany.app.beans;

import com.mycompany.app.interfaces.Animals;

public class Bear implements Animals {

    private String name;

    public Bear(String iName){
        this.name = iName;
    }

    public String getName(){
        return this.name;
    }
    
    public void tame(){
        System.out.println("Bringing a \""+this.getName()+" \" for taming.");
    }
}