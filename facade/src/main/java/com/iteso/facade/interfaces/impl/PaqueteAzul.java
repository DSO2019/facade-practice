package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Decoracion;

public class PaqueteAzul implements Decoracion{

    public void putFlowers(){
        System.out.print("Flores azules");
    };

    public void putBallons(){
        System.out.print("Globos azules");
    };
}