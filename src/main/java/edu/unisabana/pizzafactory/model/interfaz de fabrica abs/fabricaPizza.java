
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;

public interface FabricaPizza {

    Amasador crearAmasador();
    Moldeador crearMoldeador();
    Horneador crearHorneador();

}