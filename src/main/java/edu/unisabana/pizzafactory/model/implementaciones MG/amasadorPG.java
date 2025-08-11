package edu.unisabana.pizzafactory.model.implementacionesMG;

import edu.unisabana.pizzafactory.model.interfaces.amasador;

public class amasadorPG implements amasador {

    @Override
    public void Amasar() {
        System.out.println("Amasando masa gruesa...");
    }
}