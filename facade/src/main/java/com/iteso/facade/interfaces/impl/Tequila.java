package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Bebidas;

public class Tequila implements Bebidas{

    private boolean hardAlcohol = false;

    @Override
    public void lightAlcohol(){
        this.hardAlcohol = false;
    };

    public void hardAlcohol(){
        this.hardAlcohol = true;
    };

    public void servir(){
        String temp = "";
        if(!this.hardAlcohol){
            temp = "Con moderación.";
        }
        System.out.print("Beban!" + temp);
    };
}