package edu.unisabana.pizzafactory.model.fabricas;

import edu.unisabana.pizzafactory.model.interfaces.amasador;
import edu.unisabana.pizzafactory.model.interfaces.moldeador;
import edu.unisabana.pizzafactory.model.interfaces.horneador;
import edu.unisabana.pizzafactory.model.implementacionesMD.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.implementacionesMD.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.implementacionesMD.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.interfazdefabricaabs.fabricaPizza;

public class fabricaPD implements fabricaPizza {

    @Override
    public amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
}