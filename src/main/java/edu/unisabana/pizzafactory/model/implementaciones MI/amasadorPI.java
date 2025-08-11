package edu.unisabana.pizzafactory.model.implementacionesMI;

import edu.unisabana.pizzafactory.model.interfaces.amasador;

public class AmasadorPI implements amasador {

    @Override
    public void amasar() {
        System.out.println("Amasando masa integral...");
    }
}