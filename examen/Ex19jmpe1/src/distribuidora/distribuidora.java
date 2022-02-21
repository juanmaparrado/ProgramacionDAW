package distribuidora;

import articulos.*;
import pedido.pedido;

public class distribuidora {
    private String nombre ;
    private articuloalmacen[] articuloalmacen;
    private int exitsAlmacen ;

    public distribuidora(String nombre,int maximoArt){
        this.nombre = nombre ;
        articuloalmacen = new articuloalmacen[maximoArt] ;
        exitsAlmacen = 0 ;
    }

    public boolean almacenarArticulo(articuloalmacen a) {
        boolean capacidad = true ;
        if (exitsAlmacen >= articuloalmacen.length) {
            return false;
        }
        else{
            articuloalmacen[exitsAlmacen++] = a ;
            capacidad = true ;
        }
        return capacidad ;
    }

    public String obtenerListado() {
        String resultado = "";
        resultado += "Listado de articulos del almacen de la tienda "+nombre+ ":\n";
        for (int i = 0; i < exitsAlmacen; i++) {
            resultado += "- "+articuloalmacen[i] + "\n" ;
        }
        return resultado;
    }

   /* public boolean servirPedido(pedido p) {
        for (int i = 0; i < this.exitsAlmacen ; i++) {
            boolean posibilidad = false ;
            for (int j = 0; j < p.obtenerNumArticulos(); j++) {
                
            }
        }
        return false;
    }*/
    
}


    

