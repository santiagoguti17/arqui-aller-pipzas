package edu.unisabana.pizzafactory.model.Fabricas;

import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.ImplementacionesMG.AmasadorPG;
import edu.unisabana.pizzafactory.model.ImplementacionesMG.MoldeadorPG;
import edu.unisabana.pizzafactory.model.ImplementacionesMG.HorneadorPG;
import edu.unisabana.pizzafactory.model.Interfaces.FabricaPizza;

public class FabricaPG implements FabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPG();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPG();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPG();
    }
}