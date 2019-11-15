
package com.mycompany.app.beans;

import com.mycompany.app.interfaces.SharpObjects;

public class Razor implements SharpObjects {

    private String name;

    public Razor(String iName){
        this.name = iName;
    }

    public String getName(){
        return this.name;
    }
    
    public void cut(){
        System.out.println("\""+this.getName()+" \" are allowed. Just don't get messy!");
    }
}