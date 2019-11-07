// Proyecto Programacion 1 - Karla Cedeño Matamoros
package proyecto;
public class tienda {
    
    private static int idActual = 1; //Creamos esta variable para usarla al crear una tienda.
    
    private int id = 0;
    private String nombre = "";
    private String direccion = "";
    private String encargado = "";
    
    public tienda (int pid, String pnombre, String pdireccion, String pencargado){
        this.id = idActual++; // Aqui la usamos para incrementar el id cada vez que crea una tienda
        this.nombre = pnombre;
        this.direccion = pdireccion;
        this.encargado = pencargado;
        
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "tienda{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", encargado=" + encargado + '}';
    }
    
    
    
    
    
}
