package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Banquete;

public class BanquetePollo implements Banquete{
    @Override
    public void servir(){
        System.out.print("El pollo ha sido servido yum");
    }
}