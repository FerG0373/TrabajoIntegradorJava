import java.util.List;
import java.util.ArrayList;

//Nombre de la clase
public class Equipo {

    //Atributos
    String nombre;

    //Método Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    //Métodos
    public void Resultado(int ResultadoFinal) {
        items.remove(ResultadoFinal);
    }

    public List<Equipos> getItems() {
        return items;
    }
}














/*
    private List<Equipos> items;

    //Constructor
    public Equipo() {
        this.items = new ArrayList<Equipos>();
    }
    public void Resultado(int ResultadoFinal) {
        items.remove(ResultadoFinal);
    }
    public List<Equipos> getItems() {
        return items;
    }

 */