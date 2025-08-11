package edu.unisabana.pizzafactory.model.fabricas;

import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.implementacionesmd.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.implementacionesmd.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.implementacionesmd.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.interfazdefabricaabs.FabricaPizza;

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