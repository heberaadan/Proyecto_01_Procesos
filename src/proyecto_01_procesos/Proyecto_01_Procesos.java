package proyecto_01_procesos;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Hhebe
 */
public class Proyecto_01_Procesos {

    public static void main(String[] args) {
        LinkedList<Proceso> procesos = new LinkedList();
        // Creamos una variable auxiliar para ingresar todos los atributos del proceso
        Proceso aux;
        int n,i,tam,memoria = 1024;
        String texto;
        Scanner leer = new Scanner(System.in);
        
        // Leemos la cantidad de procesos que queramos subir 
        System.out.print(" Ingrese el numero de procesos que va a subir: ");
        n = leer.nextInt();
        // Creamos los Procesos
        for(i=0;i<n;i++){
            
            aux = new Proceso();
            
            leer.nextLine(); // Limpia el buffer del teclado
            
            // Ingresa los valores del proceso
            System.out.println(" =========== Proceso "+(i+1)+" =========== ");
            aux.SetIDartificial(i+1);
            System.out.print(" Ingresa el ID: ");
            texto = leer.nextLine();
            aux.SetID(texto);
            System.out.print(" Ingresa el Nombre: ");
            texto = leer.nextLine();
            aux.SetName(texto);
            System.out.print(" Ingresa el tamano del proceso: ");
            tam = leer.nextInt();
            aux.SetSize(tam);
            System.out.print(" Ingresa su prioridad: ");
            tam = leer.nextInt();
            aux.SetPriority(tam);
            System.out.print(" Ingresa el tiempo para su ejecucion: ");
            tam = leer.nextInt();
            aux.SetTime(tam);
            System.out.print(" Ingresa el tiempo de llegada: ");
            tam = leer.nextInt();
            aux.Setarrival(tam);
            
            // Termina de crear el proceso y lo guarda
            procesos.add(aux);
        }
        Planificador.ProcesosListos(procesos,memoria);
    }
}
