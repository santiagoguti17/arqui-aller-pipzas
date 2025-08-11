package edu.unisabana.pizzafactory.model.ImplementacionesMD;

import edu.unisabana.pizzafactory.model.Interfaces.Horneador;

public class HorneadorPizzaDelgada implements Horneador {

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de masa delgada...");
    }
}