package edu.unisabana.pizzafactory.model.ImplementacionesMD;


import edu.unisabana.pizzafactory.model.Interfaces.Amasador;

public class AmasadorPizzaDelgada implements Amasador {

    @Override
    public void amasar() {
        System.out.println("Amasando masa delgada...");
    }
}