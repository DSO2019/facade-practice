package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Luces;

public class FocosSala2 implements Luces{
    @Override
    public void on(){
        System.out.print("Encendido");
    };

    public void partyMode(){
        System.out.print("Epileptico");
    };

    public void lightMode(){
        System.out.print("Romantico");
    };
    
    public void off(){
        System.out.print("Apagado");
    };
}