package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfazdefabricaabs.FabricaPizza;

public class PreparadorPizza {

    public void prepararPizza(FabricaPizza fabrica, Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        Amasador amasador = fabrica.crearAmasador();
        Moldeador moldeador = fabrica.crearMoldeador();
        Horneador horneador = fabrica.crearHorneador();

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
