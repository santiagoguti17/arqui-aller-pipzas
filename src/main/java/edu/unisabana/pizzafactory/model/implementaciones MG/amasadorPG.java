package edu.unisabana.pizzafactory.model.implementacionesMG;

import edu.unisabana.pizzafactory.model.interfaces.amasador;

public class amasadorPG implements amasador {

    @Override
    public void amasar() {
        System.out.println("Amasando masa gruesa...");
    }
}