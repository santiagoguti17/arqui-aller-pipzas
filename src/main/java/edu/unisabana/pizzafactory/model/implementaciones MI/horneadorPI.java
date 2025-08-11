package edu.unisabana.pizzafactory.model.implementacionesMI;

import edu.unisabana.pizzafactory.model.interfaces.horneador;

public class HorneadorPI implements horneador {

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de masa integral...");
    }
}