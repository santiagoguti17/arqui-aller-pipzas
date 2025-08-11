package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.Interfaces.FabricaPizza;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.Fabricas.FabricaPD;
import edu.unisabana.pizzafactory.model.Fabricas.FabricaPG;
import edu.unisabana.pizzafactory.model.Fabricas.FabricaPI;
import java.util.logging.Logger;
import java.util.logging.Level;

public class PreparadorPizza {

    public static void main(String args[]){
    try {
        Ingrediente[] ingredientes = new Ingrediente[]{
            new Ingrediente("queso", 1),
            new Ingrediente("jamon", 2)
        };            

        PreparadorPizza pp = new PreparadorPizza();

        // Lista de fábricas
        FabricaPizza[] fabricas = {
            new FabricaPI(), // Integral
            new FabricaPD(), // Delgada
            new FabricaPG()  // Gruesa
        };

        // Iterar y preparar cada tipo de masa
        for (FabricaPizza fabrica : fabricas) {
            pp.prepararPizza(fabrica, ingredientes, Tamano.MEDIANO);
            System.out.println("--------------------------------------------------");
        }

    } catch (ExcepcionParametrosInvalidos ex) {
        Logger.getLogger(PreparadorPizza.class.getName())
              .log(Level.SEVERE, "Algo ha salido mal en la preparación de la Pizza", ex);
    }
}

    public void prepararPizza(FabricaPizza fabrica, Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        Amasador amasador = fabrica.crearAmasador();
        Moldeador moldeador = fabrica.crearMoldeador();
        Horneador horneador = fabrica.crearHorneador();

        amasador.amasar();

        if (tam == Tamano.PEQUENO) {
            moldeador.moldearPizzaPequena();
        } 
        else if (tam == Tamano.MEDIANO) {
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
