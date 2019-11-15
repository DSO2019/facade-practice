package com.mycompany.app;

import com.mycompany.app.impl.BandaMs;
import com.mycompany.app.impl.CentroDeMesa;
import com.mycompany.app.impl.Langosta;
import com.mycompany.app.impl.MesaPrincipal;
import com.mycompany.app.impl.PistaBailePrincipal;
import com.mycompany.app.impl.SujetoConCamara;
import com.mycompany.app.impl.SujetoDeSeguridad;
import com.mycompany.app.impl.TecateLight;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Decoracion dec = new CentroDeMesa();
        Fotografo fot = new SujetoConCamara();
        Musica music = new BandaMs();
        PistaBaile pista= new PistaBailePrincipal();
        Comida comida = new Langosta();
        Bebidas bebida = new TecateLight();
        Mesas mesa= new MesaPrincipal();
        Seguridad seguridad = new SujetoDeSeguridad();
        
        facade graduationFacade = new facade(
        		bebida,
        		comida,
        		dec, 
        		fot,
        		mesa, 
        		music, 
        		pista,
        		seguridad);
        
        graduationFacade.StartGraduation();
        graduationFacade.FinishGraduation();
    }
}
