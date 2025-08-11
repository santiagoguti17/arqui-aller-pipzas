package edu.unisabana.pizzafactory.model.ImplementacionesMI;

import edu.unisabana.pizzafactory.model.Interfaces.Horneador;

public class HorneadorPI implements Horneador {

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de masa integral...");
    }
}