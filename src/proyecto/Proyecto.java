package proyecto;
import java.util.*;
public class Proyecto {

    public static void main(String[] args) {
        
        int opcion = 0;
        ArrayList<artista> artistas = new ArrayList<artista>();
        ArrayList<disco> discos = new ArrayList<disco>();
        
        Scanner SC = new Scanner(System.in);
        
        do{
            
            System.out.println("♪♪ Sistema de Inventario ♪♪");
            System.out.println("1 Agregar artista");
            System.out.println("2 Agregar disco a artista");
            System.out.println("3 Desplegar informacion de artistas");
            System.out.println("4 Agregar tienda");
            System.out.println("5 Vincular artista a tienda");
            System.out.println("6 Salir");
            opcion = SC.nextInt();
            System.out.println("");
             
            switch (opcion){
                case 1: 
                    String banda = "";
                    
                    System.out.println("Digite el artista que desea agregar:");
                    banda = SC.next();
                    artista artistaUno = new artista(banda, new ArrayList<Integer>());
                    artistas.add(artistaUno); 
                    break;
                    
                case 2:
                    System.out.println("Escoja el id del artista al que desea agregar un disco");
                    artistas.forEach((n) -> System.out.println(n.getId() + " " + n.getNombre()));
                    int testBanda = SC.nextInt();
                    System.out.println("Ingrese el nombre del disco");
                    String nombre = SC.next();
                    System.out.println("Ingrese el genero del disco");
                    String genero = SC.next();
                    System.out.println("Ingrese el año del disco");
                    int anno = SC.nextInt();
                    int opcion2 = 0;
                    ArrayList<String> canciones = new ArrayList<String>();
                    
                    do{
                        System.out.println("Ingrese la cancion");   
                        canciones.add(SC.next());
                        System.out.println("Si desea agregar otra cancion digite 2"); 
                        opcion2 = SC.nextInt();
                        
                    }while(opcion2 != 1);
                            
                    disco disco = new disco(nombre,genero,anno,canciones);
                    int idDisco = disco.getId();
                    artistas.get(testBanda - 1).addDisco(idDisco);
                    discos.add(disco);
                    break;
                    
                case 3:
                    for (artista tempt:artistas) {
                        System.out.println("El id del artista es: " + tempt.getId());
                        System.out.println("El artista es: " + tempt.getNombre());
                        for(int tempt1: tempt.getDisco()) {
                            disco temptDisco = discos.get(tempt1 -1);
                            System.out.println("El nombre del disco es: " + temptDisco.getNombre()); 
                            int contador = 0;
                            for(String cancionDisco: temptDisco.getCanciones()){
                                System.out.println("Cancion "+ ++contador + ": " + cancionDisco);   
                            }
                            
                        }
                        System.out.println("");
                    }
                    
                    break;
                    
                default:
                    System.out.println("Seleccione un valor correcto");
                    break;
                    
            }
     
        }while(opcion != 6);
        
    }

  
    
}
