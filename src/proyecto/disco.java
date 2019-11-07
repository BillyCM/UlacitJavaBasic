// Proyecto Programacion 1 - Karla Cedeño Matamoros
package proyecto;

import java.util.ArrayList;

public class disco {
   
    
    private static int idActual = 1; //Creamos esta variable para usarla al asignar el id del disco ingresado.
    
    private int id = 0;
    private String nombre = "";
    private String genero = "";
    private int anno = 0;
    private ArrayList<String> canciones = new ArrayList<String>(); // Lista donde van las canciones del disco.
    
    public disco (String pnombre, String pgenero, int panno, ArrayList pcanciones){
        this.id = idActual++; // Aqui la usamos para incrementar el id cada vez que se agrega un disco
        this.nombre = pnombre;
        this.genero = pgenero;
        this.anno = panno; 
        this.canciones = pcanciones;
    }

    public disco() {
    }
    
    //No se utiliza el get y el set de la variable idActual ya que solo se usa internamente.

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public ArrayList<String> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<String> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "disco{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", anno=" + anno + ", canciones=" + canciones + '}';
    }

  
    
}

