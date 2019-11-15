
package com.mycompany.app.beans;

import com.mycompany.app.interfaces.Dreams;

public class BiggestDream implements Dreams {

    private String name;

    public BiggestDream(String iName){
        this.name = iName;
    }

    public String getName(){
        return this.name;
    }
    
    public void dream(){
        System.out.println("Now you can bring your dream of \""+this.getName()+" \" to the party. We do not assure it will come true!");
    }
}