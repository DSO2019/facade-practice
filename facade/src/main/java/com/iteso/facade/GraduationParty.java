package com.iteso.facade;

import com.iteso.facade.interfaces.*;

/**
 * Hello world!
 *
 */
public class GraduationParty {

    Banquete banquete;
    Luces luces;
    Fotografo fotografo;
    DJ dj;
    Bebidas bebidas;
    Decoracion decoracion;
    Mariachi mariachi;
    Valet valet;

    public GraduationParty(Banquete banquete,
                                Luces luces,
                                Fotografo fotografo,
                                DJ dj,
                                Bebidas bebidas,
                                Decoracion decoracion,
                                Mariachi mariachi,
                                Valet valet){
        this.banquete = banquete;
        this.luces = luces;
        this.fotografo = fotografo;
        this.dj = dj;
        this.bebidas = bebidas;
        this.decoracion = decoracion;
        this.mariachi = mariachi;
        this.valet = valet;
    }

    public void initParty(){
        luces.on();

        decoracion.putFlowers();
        decoracion.putBallons();

        valet.receivePeople();
        valet.parkCars();

        banquete.servir();

        bebidas.lightAlcohol();
        bebidas.servir();

        fotografo.takePictures();

        luces.partyMode();
        dj.startMusic();
        dj.dropBass();

        

    }

    public void endParty(){
        dj.stopMusic();
        luces.lightMode();
        mariachi.startMusic();

        bebidas.hardAlcohol();
        bebidas.servir();

        fotografo.charge();
        valet.handleDrunks();


    }

}
