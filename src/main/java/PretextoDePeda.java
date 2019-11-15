import implementaciones.*;

/**
 * interface PretextoDePeda.
 */
public class PretextoDePeda {
    /**
     *
     */
    public final void ambiente() {
        Bienvenida comidaPisto = new FiestaGraduacion();
        comidaPisto.darBienvenida();


        Brindis brindis = new BrindisMediaNoche();
        brindis.hacerBrindis();

        Fotografias fotografias = new Fotografo();
        fotografias.tomarFotografias();

        Cena cena = new BirriaConArroz();
        cena.servir();
        cena.volveraServir();

        Bebidas bebidas = new CartondeCaguama();
        bebidas.servirBebidas();

        Musik grupoMusical = new Marichi();
        grupoMusical.miusic();

        MesaDePostres mesaDePostres = new Botanas();
        mesaDePostres.servirPostes();
    }
}
