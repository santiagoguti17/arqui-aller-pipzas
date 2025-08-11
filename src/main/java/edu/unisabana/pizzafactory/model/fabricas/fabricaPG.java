package edu.unisabana.pizzafactory.model.fabricas;

import edu.unisabana.pizzafactory.model.interfaces.amasador;
import edu.unisabana.pizzafactory.model.interfaces.moldeador;
import edu.unisabana.pizzafactory.model.interfaces.horneador;
import edu.unisabana.pizzafactory.model.implementacionesMG.amasadorPG;
import edu.unisabana.pizzafactory.model.implementacionesMG.moldeadorPG;
import edu.unisabana.pizzafactory.model.implementacionesMG.horneadorPG;
import edu.unisabana.pizzafactory.model.interfazdefabricaabs.fabricaPizza;

public class fabricaPG implements fabricaPizza {

    @Override
    public amasador crearAmasador() {
        return new amasadorPG();
    }

    @Override
    public moldeador crearMoldeador() {
        return new moldeadorPG();
    }

    @Override
    public horneador crearHorneador() {
        return new horneadorPG();
    }
}