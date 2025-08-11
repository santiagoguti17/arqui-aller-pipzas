package edu.unisabana.pizzafactory.model.Fabricas;

import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.ImplementacionesMI.AmasadorPI;
import edu.unisabana.pizzafactory.model.ImplementacionesMI.MoldeadorPI;
import edu.unisabana.pizzafactory.model.ImplementacionesMI.HorneadorPI;
import edu.unisabana.pizzafactory.model.Interfaces.FabricaPizza;

public class FabricaPI implements FabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPI();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPI();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPI();
    }
}