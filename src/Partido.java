import java.util.List;
import java.util.ArrayList;

//Nombre de la clase
public class Partido {

    //Atributos
    private List<Equipos> items;

    //Constructor
    public Partido() {
        this.items = new ArrayList<Equipos>();
    }

    //Métodos
    public void Resultado(int ResultadoFinal) {
        items.remove(ResultadoFinal);
    }

    public List<Equipos> getItems() {
        return items;
    }
}
