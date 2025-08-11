package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.interfaces.amasador;
import edu.unisabana.pizzafactory.model.interfaces.moldeador;
import edu.unisabana.pizzafactory.model.interfaces.horneador;
import edu.unisabana.pizzafactory.model.interfazdefabricaabs.fabricaPizza;

public class PreparadorPizza {

    public void prepararPizza(fabricaPizza fabrica, Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        amasador amasador = fabrica.crearAmasador();
        moldeador moldeador = fabrica.crearMoldeador();
        horneador horneador = fabrica.crearHorneador();

        amasador.amasar();

        if (tam == Tamano.PEQUENA) {
            moldeador.moldearPizzaPequena();
        } 
        else if (tam == Tamano.MEDIANA) {
            moldeador.moldearPizzaMediana();
        } 
        else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }

        aplicarIngredientes(ingredientes);
        horneador.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        System.out.println("Aplicando ingredientes:");
        for (Ingrediente ing : ingredientes) {
            System.out.println("- " + ing.getNombre());
        }
    }
}
