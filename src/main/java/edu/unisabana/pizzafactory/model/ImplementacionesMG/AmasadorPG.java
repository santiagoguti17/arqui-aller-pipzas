package edu.unisabana.pizzafactory.model.ImplementacionesMG;

import edu.unisabana.pizzafactory.model.Interfaces.Amasador;

public class AmasadorPG implements Amasador {

    @Override
    public void amasar() {
        System.out.println("Amasando masa gruesa...");
    }
}