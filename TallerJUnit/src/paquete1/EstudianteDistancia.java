
package paquete1;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante{
       
    private ArrayList<Nota> notas;
    private double mejorNota;
    private double peorNota;
    private double promedio;
    
    public void establecerNotas(ArrayList<Nota> ns){
        notas = ns;
    
    }
    
    public void obtenerNotas(ArrayList<Nota> ns){
        notas = ns;
    
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    
    

}
