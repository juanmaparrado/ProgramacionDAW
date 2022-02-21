package tienda;

import articulos.*;
import listacompra.*;

public class tienda {
    private String nombre;
    private articulo[] articulo;
    private int existAlmacen;

    public tienda(String nombre,int maxArt){
        this.nombre = nombre ; 
        articulo = new articulo[maxArt];
        existAlmacen = 0;
    }

    public boolean almacenarArticulo(articulo a) {
        boolean capacidad = true ;
        if (existAlmacen >= articulo.length) {
            return false;
        }
        else{
            articulo[existAlmacen++] = a ;
            capacidad = true;
        }
        return capacidad;        
    }

   
        

    public String listadoTienda() {
        String resultado = "";
        resultado += "Listado de articulos del almacen de la tienda "+nombre+ ":\n";
        for (int i = 0; i < existAlmacen; i++) {
            resultado += "- "+articulo[i] ;
        }
        return resultado;
    }

}
