package implementaciones;

/**
 * clase BirriaConArroz.
 */
public class BirriaConArroz implements Cena{

    @Override
    public void Servir() {
        System.out.println("Aqui tienes tu comida itesiano");
    }

    @Override
    public void VolveraServir() {
        System.out.println("Me regalas mas comida porfavor");

    }
}
