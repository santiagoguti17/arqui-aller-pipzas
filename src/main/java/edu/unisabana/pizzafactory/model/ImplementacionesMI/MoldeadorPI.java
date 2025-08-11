package edu.unisabana.pizzafactory.model.ImplementacionesMI;

import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;

public class MoldeadorPI implements Moldeador {

    @Override
    public void moldearPizzaMediana() {
        System.out.println("Moldeando pizza mediana de masa integral...");
    }

    @Override
    public void moldearPizzaPequena() {
        System.out.println("Moldeando pizza pequeña de masa integral...");
    }

    @Override
    public void moldearPizzaGrande() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moldearPizzaGrande'");
    }
}