package restaurante;
import ingredientes.*;
import receta.*;

public class restaurante {
    private String nombre;
    private articulo [] articulo;
    private int numArticulos;

    public restaurante(String nombre,int cantidadArticulos){
        articulo = new articulo[cantidadArticulos];
        this.nombre  = nombre;
        this.numArticulos = 0;
    }
    public boolean almacenarArticulo(articulo t) {
        boolean capacidad = true;

        if (numArticulos>= articulo.length) {
            return false;
        }else{
            articulo[numArticulos++] = t;
            capacidad = true ;
        }
        return capacidad;
    }
    public boolean cocinaReceta(receta r) {

        for (int i = 0; i < numArticulos; i++) {
             boolean posibilidad = false;
             for (int j = 0; j < r.numeroIng() ; j++) {
                 if ((articulo[i].mostrarNombre()).equals(r.obtenerIngrediente(j).mostrarNombre()) && (articulo[i].stock() < r.oobtenerIngrediente(j).mostrarCantidad())) {
                   return false;  
                 }
                 if (articulo[i].mostrarNombre()).equals(r.obtenerIngrediente(j).mostrarNombre()) {
                     posibilidad = true;
                 }
             }
             
        }
       
       
        
    }
}
