// Proyecto Programacion 1 - Karla Cedeño Matamoros
package proyecto;

import java.util.ArrayList;

public class artista {
    
    private static int idActual = 1; //Creamos esta variable para usarla al crear un artista.
    
    private int id = 0;
    private String nombre = "";
    private ArrayList<Integer> disco = new ArrayList(); 
    
    public artista()
    {
    
    }
    
    public artista(String pnombre, ArrayList<Integer> pdisco){

        this.id = idActual++; // Aqui la usamos para incrementar el id cada vez que crea un artista.
        this.nombre = pnombre;
        this.disco = pdisco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getDisco() {
        return disco;
    }

    public void setDisco(ArrayList<Integer> disco) {
        this.disco = disco;
    }
    
    public void addDisco(int discoId) {
        this.disco.add(discoId);
    }

    @Override
    public String toString() {
        return "artista{" + "id=" + id + ", nombre=" + nombre + ", disco=" + disco + '}';
    }
    
    
    
}
