package edu.unisabana.pizzafactory.model.ImplementacionesMG;

import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;

public class MoldeadorPG implements Moldeador {

    @Override
    public void moldearPizzaMediana() {
        System.out.println("Moldeando pizza mediana de masa gruesa...");
    }

    @Override
    public void moldearPizzaPequena() {
        System.out.println("Moldeando pizza pequeña de masa gruesa...");
    }

    @Override
    public void moldearPizzaGrande() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moldearPizzaGrande'");
    }
}