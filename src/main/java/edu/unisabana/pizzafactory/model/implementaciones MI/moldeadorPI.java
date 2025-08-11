package edu.unisabana.pizzafactory.model.implementacionesMI;

import edu.unisabana.pizzafactory.model.interfaces.moldeador;

public class moldeadorPI implements moldeador {

    @Override
    public void moldearPizzaMediana() {
        System.out.println("Moldeando pizza mediana de masa integral...");
    }

    @Override
    public void moldearPizzaPequena() {
        System.out.println("Moldeando pizza pequeña de masa integral...");
    }
}