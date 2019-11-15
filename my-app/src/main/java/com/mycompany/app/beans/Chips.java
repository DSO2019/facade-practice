
package com.mycompany.app.beans;

import com.mycompany.app.interfaces.Snacks;

public class Chips implements Snacks {

    private String name;

    public Chips(String iName){
        this.name = iName;
    }

    public String getName(){
        return this.name;
    }
    
    public void eat(){
        System.out.println("There would be no party without some go'ol \""+this.getName()+" \" chips. Starting to give.");
    }
}