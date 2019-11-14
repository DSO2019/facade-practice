import implementaciones.*;

public class PretextoDePeda {
    public void Ambiente(){
        Bienvenida ComidaPisto = new FiestaGraduacion();
        ComidaPisto.darBienvenida();


        Brindis brindis = new BrindisMediaNoche();
        brindis.hacerBrindis();

        Fotografias fotografias = new Fotografo();
        fotografias.tomarFotografias();

        Cena cena = new BirriaConArroz();
        cena.Servir();
        cena.VolveraServir();

        Bebidas bebidas = new CartondeCaguama();
        bebidas.servirBebidas();

        Musik grupoMusical = new Marichi();
        grupoMusical.miusic();

        MesaDePostres mesaDePostres = new Botanas();
        mesaDePostres.servirPostes();
    }
}
