package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Fotografo;

public class FotoJuan implements Fotografo{

    @Override
    public void takePictures(){
        System.out.print("Click");
    };

    public void charge(){
        System.out.print("Son una por 70 o dos por 140");
    };
}