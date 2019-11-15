package com.mycompany.app;

import com.mycompany.app.interfaces.*;

/**
 * Facade para graduación.
 *
 */
public class GraduaciónFacade {

    Salón salon;
    Música musica;
    Imprenta imprenta;
    Servicio servicio;
    EstudioFotográfico estudio;
    Comida comida;
    Bebida bebida;
    Bocadillo bocadillo;

    public GraduaciónFacade(Salón salon, Música musica, Imprenta imprenta, Servicio servicio,
                            EstudioFotográfico estudio, Comida comida, Bebida bebida, Bocadillo bocadillo) {
        this.salon = salon;
        this.musica = musica;
        this.imprenta = imprenta;
        this.servicio = servicio;
        this.estudio = estudio;
        this.comida = comida;
        this.bebida = bebida;
        this.bocadillo = bocadillo;
    }

    public void planearGraduación() {
        salon.rentar();
        musica.contratar();
        imprenta.contratar();
        servicio.contratar();
        estudio.contratar();
        comida.ordenar();
        bebida.ordenar();
        bocadillo.ordenar();
        imprenta.distribuirInvitaciones();
    }

    public void iniciarGraduación() {
        salon.acondicionar();
        musica.recibir();
        servicio.recibir();
        estudio.recibir();

        bebida.servir();
        bocadillo.servir();

        comida.servir();

        System.out.println("Inicia la fiesta y no termina <3.");
    }
}
