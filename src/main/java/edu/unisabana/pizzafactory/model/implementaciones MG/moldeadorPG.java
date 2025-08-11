package edu.unisabana.pizzafactory.model.implementacionesMG;

import edu.unisabana.pizzafactory.model.interfaces.moldeador;

public class MoldeadorPG implements moldeador {

    @Override
    public void moldearPizzaMediana() {
        System.out.println("Moldeando pizza mediana de masa gruesa...");
    }

    @Override
    public void moldearPizzaPequena() {
        System.out.println("Moldeando pizza pequeña de masa gruesa...");
    }
}