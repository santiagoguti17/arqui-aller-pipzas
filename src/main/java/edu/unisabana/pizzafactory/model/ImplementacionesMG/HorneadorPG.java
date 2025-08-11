package edu.unisabana.pizzafactory.model.ImplementacionesMG;

import edu.unisabana.pizzafactory.model.Interfaces.Horneador;

public class HorneadorPG implements Horneador {

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de masa gruesa...");
    }
}