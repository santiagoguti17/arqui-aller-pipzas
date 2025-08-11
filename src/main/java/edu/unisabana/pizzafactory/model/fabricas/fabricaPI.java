package edu.unisabana.pizzafactory.model.fabricas;

import edu.unisabana.pizzafactory.model.interfaces.amasador;
import edu.unisabana.pizzafactory.model.interfaces.moldeador;
import edu.unisabana.pizzafactory.model.interfaces.horneador;
import edu.unisabana.pizzafactory.model.implementacionesMI.amasadorPI;
import edu.unisabana.pizzafactory.model.implementacionesMI.moldeadorPI;
import edu.unisabana.pizzafactory.model.implementacionesMI.horneadorPI;
import edu.unisabana.pizzafactory.model.interfazdefabricaabs.fabricaPizza;

public class fabricaPI implements fabricaPizza {

    @Override
    public amasador crearAmasador() {
        return new amasadorPI();
    }

    @Override
    public moldeador crearMoldeador() {
        return new moldeadorPI();
    }

    @Override
    public horneador crearHorneador() {
        return new horneadorPI();
    }
}