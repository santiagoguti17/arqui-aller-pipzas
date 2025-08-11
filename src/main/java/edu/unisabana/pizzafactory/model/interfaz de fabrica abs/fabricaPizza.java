package edu.unisabana.pizzafactory.model.interfazdefabricaabs;

import edu.unisabana.pizzafactory.model.interfaces.amasador;
import edu.unisabana.pizzafactory.model.interfaces.moldeador;
import edu.unisabana.pizzafactory.model.interfaces.horneador;

public interface fabricaPizza {

    amasador crearAmasador();
    moldeador crearMoldeador();
    horneador crearHorneador();

}