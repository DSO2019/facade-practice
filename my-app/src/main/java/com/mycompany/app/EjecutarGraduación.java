package com.mycompany.app;

import com.mycompany.app.interfaces.*;
import com.mycompany.app.interfaces.impl.*;

/**
 * Clase ejecutar graduación.
 *
 */
public final class EjecutarGraduación {

    private EjecutarGraduación() {

    }

    public static void main (String[] args) {
        Salón salon = new SalónInternacional();
        Música musica = new DJTiesto();
        Imprenta imprenta = new ImpreMax();
        Servicio servicio = new Meseros();
        EstudioFotográfico estudio = new EstudioMiGraduación();
        Comida comida = new Birria();
        Bebida bebida = new Martini();
        Bocadillo bocadillo = new Chetos();

        GraduaciónFacade gf = new GraduaciónFacade(salon, musica, imprenta, servicio, estudio, comida,
                                                    bebida, bocadillo);

        gf.planearGraduación();

        gf.iniciarGraduación();        
    }
}
