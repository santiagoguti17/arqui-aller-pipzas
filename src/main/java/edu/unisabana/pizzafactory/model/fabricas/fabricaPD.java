package edu.unisabana.pizzafactory.model.Fabricas;

import edu.unisabana.pizzafactory.model.ImplementacionesMD.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.ImplementacionesMD.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.ImplementacionesMD.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.Interfaces.FabricaPizza;

public class FabricaPD implements FabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
}