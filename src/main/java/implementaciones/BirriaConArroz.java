package implementaciones;

/**
 * clase BirriaConArroz.
 */
public class BirriaConArroz implements Cena {

    @Override
    public final void servir() {
        System.out.println("Aqui tienes tu comida itesiano");
    }

    @Override
    public final void volveraServir() {
        System.out.println("Me regalas mas comida porfavor");

    }
}
