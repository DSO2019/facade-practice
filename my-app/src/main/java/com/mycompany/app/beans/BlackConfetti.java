
package com.mycompany.app.beans;

import com.mycompany.app.interfaces.Confetti;

public class BlackConfetti implements Confetti {

    private String name;

    public BlackConfetti(String iName){
        this.name = iName;
    }

    public String getName(){
        return this.name;
    }
    
    public void throwToTheFace(){
        System.out.println("Started to throw \""+this.getName()+" \" to Karen's face.");
    }
}