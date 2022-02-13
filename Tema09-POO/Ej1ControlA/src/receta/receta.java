package receta;

import ingredientes.ingrediente;

public class receta {
    private String nombre;
    private String instrucciones;
    private int cantidadIngredientes;
    private ingrediente[] ingrediente;

    public receta (String nombre , int maxIngredientes){
            this.nombre = nombre;
            this.ingrediente = new ingrediente[maxIngredientes];
            this.cantidadIngredientes = 0;

    }
    public boolean añadirIngrediente(ingrediente t){
        boolean capacidad = false;
        if (cantidadIngredientes>= ingrediente.length){
            return capacidad;
        }
        else{
            ingrediente[cantidadIngredientes++] = t;
            capacidad = true;
        }
        return capacidad;
        
    }
    public void escribirReceta(String instrucciones) {
        this.instrucciones = instrucciones ;
         
    }

    public String mostrarReceta() {
        String resultado = "" ;
        resultado += "Receta : "+nombre + "\n--------------"+"/n * Ingredientes :"  ;
        for (int i = 0; i < cantidadIngredientes; i++) {
            resultado += "- "+ ingrediente[i] + "\n";
        }
        resultado += "Instrucciones : "+instrucciones;
        
        return resultado;
    }
    public int numeroIng() {
        
        return cantidadIngredientes ;
    }
    public ingrediente obtenerIngrediente(int n) {
        if (n<0 || n>=cantidadIngredientes) {
            return null;
        }
        else{
            return ingrediente[n];
        }
    }
}
