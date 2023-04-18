
package proyecto_01_procesos;


public class Proceso {
    
    // Atributos 
    private String ID,IDart,nombre;
    private int tamaño,tiempo,prioridad,llegada;
    
    // Constructor
    public Proceso(){}
    
    // Metodos
    public void SetIDartificial(int i){
        IDart = "P"+i;
    }
    public void SetSize(int n){
        tamaño = n;
    }
    
    public void SetID(String id){
        ID = id;
    }
    
    public void SetName(String name){
        nombre = name;
    }
    
    public void SetTime(int tempo){
        tiempo = tempo;
    }
    
    public void SetPriority(int priori){
        prioridad = priori;
    }
    
    public void Setarrival(int in){
        llegada = in;
    }
    
    public int getArrival(){
        return llegada;
    }
    
    public int getPriority(){
        return prioridad;
    }
    
    public int getTime(){
        return tiempo;
    }
    
    public int getSize(){
        return tamaño;
    }
    
    public String getName(){
        return nombre;
    }
    public String getID(){
        return ID;
    }
    
    public String getIDArt(){
        return IDart;
    }
}
