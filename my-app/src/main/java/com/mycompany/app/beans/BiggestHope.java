
package com.mycompany.app.beans;

import com.mycompany.app.interfaces.Hopes;

public class BiggestHope implements Hopes {

    private String name;

    public BiggestHope(String iName){
        this.name = iName;
    }

    public String getName(){
        return this.name;
    }
    
    public void hope(){
        System.out.println("Now you can bring your hopes of \""+this.getName()+" \" to the party. We do not assure it will come true! Life is pain!");
    }
}