package edu.unisabana.pizzafactory.model.ImplementacionesMI;

import edu.unisabana.pizzafactory.model.Interfaces.Amasador;

public class AmasadorPI implements Amasador {

    @Override
    public void amasar() {
        System.out.println("Amasando masa integral...");
    }
}