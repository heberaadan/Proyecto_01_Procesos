/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_01_procesos;

import java.util.LinkedList;

public class Planificador {
    
    // Imprime la Cola de Procesos que reciba 
    public static void Imprimir(LinkedList<Proceso> lista){
        int i;
        for (i=lista.size()-1;i>=0;i--){
            System.out.print(lista.get(i).getIDArt()+" ");
        }
        System.out.println();
    }
    
    // Valida que haya memoria disponible para subir a la lista de procesos Listos para Ejecución 
    public static boolean ValidarMemoria(Proceso Pn,int memoria){
        boolean validar;
        if (Pn.getSize() < memoria){
            validar = true;
        }else{
            validar = false;
        }
        return validar;
    }
    
    // Planifica la Cola de procesos Listos
    public static void ProcesosListos(LinkedList<Proceso> Listos,int memoria){
        
        int i;
        // Cola Procesos Listos de Ejecución 
        LinkedList<Proceso> listosEje = new LinkedList();
        
        System.out.println("======= COLA DE PROCESOS LISTOS ======= ");
        Imprimir(Listos);
        
        
        for (i=0;i<Listos.size();i++){
            // Valida si hay memoria disponible
           if(ValidarMemoria(Listos.get(i), memoria)){
               // Imprime el mensaje en la consola y agrega el procesos a la Cola de Procesos Listos para Ejecución 
               memoria = memoria - Listos.get(i).getSize();
               System.out.println("Subio el proceso "+Listos.get(i).getIDArt()+ " y restan "+memoria+" unidades de memoria");
               listosEje.add(Listos.peek());
           }else{
               break;
           }
        }
        
        System.out.println("======= COLA DE PROCESOS LISTOS ======= ");
        Imprimir(Listos);
        System.out.println("======= COLA DE PROCESOS LISTOS PARA EJECUCION ======= ");
        Imprimir(listosEje);
    }
    
    public static void RoundRobin(LinkedList<Proceso> listEje){
        int quantum = 4;
        Proceso CPU = new Proceso();
        
        
    }
}
