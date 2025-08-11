package edu.unisabana.pizzafactory.model.Fabricas;

import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.implementacionesMG.amasadorPG;
import edu.unisabana.pizzafactory.model.implementacionesMG.moldeadorPG;
import edu.unisabana.pizzafactory.model.implementacionesMG.horneadorPG;
import edu.unisabana.pizzafactory.model.interfazdefabricaabs.fabricaPizza;

public class FabricaPG implements fabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new amasadorPG();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new moldeadorPG();
    }

    @Override
    public Horneador crearHorneador() {
        return new horneadorPG();
    }
}