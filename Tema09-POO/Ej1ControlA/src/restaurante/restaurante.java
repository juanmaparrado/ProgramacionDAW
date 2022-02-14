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
    public boolean cocinaReceta(receta r){
        for(int i=0;i<this.numArticulos;i++){
          boolean sepuede=false;
          for(int j=0;j<r.numeroIng();j++){
            if((articulo[i].mostrarNombre()).equals(r.obtenerIngrediente(j).mostrarNombre()) && (articulo[i].stock() < r.obtenerIngrediente(j).mostrarCantidad())){
              return false;
            }
            if((articulo[i].mostrarNombre()).equals(r.obtenerIngrediente(j).mostrarNombre())){
              sepuede=true;
            }
          }
          if(!sepuede){
            return false;
          }
        }
          for(int i=0;i<this.numArticulos;i++){
            for(int j=0;j<r.numeroIng();j++){
              if((articulo[i].mostrarNombre()).equals(r.obtenerIngrediente(j).mostrarNombre())){ 
                articulo[i].gastar(r.obtenerIngrediente(j).mostrarCantidad());
              }
            }
          }
          return true;
      }
      public String listadoAlmacen(){
        String string="";
        string+="Listado de artículos del almacén del restaurante '"+this.nombre+"':";
        for(int i=0;i<this.numArticulos;i++){
             string+="- "+this.articulo[i].mostrarNombre()+" -> Cantidad: "+this.articulo[i].stock()+"\n"; 
          }
        return string; 
      }    
   
       
        
    
}
