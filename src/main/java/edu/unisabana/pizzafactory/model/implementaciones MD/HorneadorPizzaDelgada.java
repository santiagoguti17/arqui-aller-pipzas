

import edu.unisabana.pizzafactory.model.interfaces.Horneador;

public class HorneadorPizzaDelgada implements Horneador {

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de masa delgada...");
    }
}