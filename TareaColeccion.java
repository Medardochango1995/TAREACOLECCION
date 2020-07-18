/*
TAREA COLECCION
 */
package tareacoleccion;

/**
 *
 * @author Medardo Rene Chango Caguana
 */
import java.util.ArrayList;
import java.util.Collection;
public class TareaColeccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipo de lista de elementos del proyecto 
        System.out.println("  ***UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE*** ");
         System.out.println("             ***PROGRAMACION*** ");
         System.out.println("\033[34m-Autor: Medardo Chango");
          System.out.println("****************************************************");
           System.out.println("\033[31mIMPLEMENTOS DEL PROYECTO "); 
          System.out.println("");
        Collection listaElementosimplementados = new ArrayList<String>();
        listaElementosimplementados.add("Programa_Proteus");
        listaElementosimplementados.add("Baquelita_perforada");
        listaElementosimplementados.add("Pulsadores");
        listaElementosimplementados.add("Diodos_Led");
        listaElementosimplementados.add("Resistencias");
        listaElementosimplementados.add("Cautin");
        listaElementosimplementados.add("Estanio");
        listaElementosimplementados.add("Pomada");
        listaElementosimplementados.add("Cables");
        listaElementosimplementados.add("Fuente_DC");
        listaElementosimplementados.add("Prototipo_vehiculo");
        listaElementosimplementados.add("Prototipo_tablero_instrumentos");
        System.out.println("Numero de elementos implementados antes de ser "
                + "eliminados:"+listaElementosimplementados.size());
         System.out.println("**LOS ELEMENTOS  QUE SE VAN A EMPLEAR :**");
          System.out.println(listaElementosimplementados.toString());
          listaElementosimplementados.remove("Programa_Proteus");
          listaElementosimplementados.remove("Baquelita_perforada");
          listaElementosimplementados.remove("Pulsadores");
          listaElementosimplementados.remove("Diodos_Led");
          listaElementosimplementados.remove("Resistencias"); 
          listaElementosimplementados.remove("Cautin");
          listaElementosimplementados.remove("Estanio");
          listaElementosimplementados.remove("Pomada");
          listaElementosimplementados.remove("Cables");
          listaElementosimplementados.remove("Fuente_DC");
        System.out.println("Lista de elementos despues de ser implementados:"
                +listaElementosimplementados.size());
        System.out.println("**LOS ELEMENTOS QUE AUN NO HAN SIDO INPLEMENTADOS SON:**");
        System.out.println(listaElementosimplementados.toString());   
    }
    
}
