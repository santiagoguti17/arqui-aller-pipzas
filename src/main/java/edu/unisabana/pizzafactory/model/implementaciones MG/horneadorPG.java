package edu.unisabana.pizzafactory.model.implementacionesMG;

import edu.unisabana.pizzafactory.model.interfaces.horneador;

public class horneadorPG implements horneador {

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de masa gruesa...");
    }
}