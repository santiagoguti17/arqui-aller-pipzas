package edu.unisabana.pizzafactory.model.Fabricas;

import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.implementacionesMI.amasadorPI;
import edu.unisabana.pizzafactory.model.implementacionesMI.moldeadorPI;
import edu.unisabana.pizzafactory.model.implementacionesMI.horneadorPI;
import edu.unisabana.pizzafactory.model.Fabricas.FabricaPizza;

public class FabricaPI implements FabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new amasadorPI();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new moldeadorPI();
    }

    @Override
    public Horneador crearHorneador() {
        return new horneadorPI();
    }
}