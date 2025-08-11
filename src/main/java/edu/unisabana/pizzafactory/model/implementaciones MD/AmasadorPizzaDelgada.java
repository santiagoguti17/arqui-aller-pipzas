

import edu.unisabana.pizzafactory.model.interfaces.Amasador;

public class AmasadorPizzaDelgada implements Amasador {

    @Override
    public void amasar() {
        System.out.println("Amasando masa delgada...");
    }
}