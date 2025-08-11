

import edu.unisabana.pizzafactory.model.interfaces.Moldeador;

public class MoldeadorPizzaDelgada implements Moldeador {

    @Override
    public void moldearPizzaMediana() {
        System.out.println("Moldeando pizza mediana de masa delgada...");
    }

    @Override
    public void moldearPizzaPequena() {
        System.out.println("Moldeando pizza pequeña de masa delgada...");
    }
}
