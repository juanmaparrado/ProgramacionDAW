package repasoobjetos;

import java.util.ArrayList;

/**
 * Persona
 */
public class Persona {
    private String DNI;
    private String  nombre;
    private ArrayList<Libro> listalibros = new ArrayList<Libro>();
    
    public Persona(String DNI, String nombre){
        this.DNI = DNI;
        this.nombre = nombre;
    }
    public Persona(String DNI, String nombre, Libro libro){
        this.DNI = DNI;
        this.nombre = nombre;
        listalibros.add(libro);
    }

    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }

    public String getDNI(){
        return DNI;
    }

    public String getNombre(){ 
        return nombre;
    }

    public void nuevolibro(Libro l ){
        listalibros.add(l);
    }

    @Override
    public String toString () {
        
        String result="";
        result+="Nombre: "+this.nombre+"     ";
        result+="DNI :"+this.DNI+"\n";
        result+="---------------------------------------------------------------\n";
       
        if (this.listalibros.isEmpty()) {

        result +="No ha leido nada aun!";

        } else {  
          for (Libro l: this.listalibros) {
               result+=l.toString();  
           }
        }   
        return result;
    }



 

}