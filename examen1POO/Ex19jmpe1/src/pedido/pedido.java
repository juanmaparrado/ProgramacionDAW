package pedido;

import articulos.*;

public class pedido {
    private String nombre ;
    private String observaciones;
    private int cantArticulos;
    private articulobase[] articulopedido ;
    
    public pedido(String nombre,int artMax){

        this.nombre = nombre ;
        this.cantArticulos = 0;
        this.articulopedido = new articulopedido[artMax] ;
        this.observaciones = "";

    }

    public boolean añadirArticuloPedido(articulopedido a) {
        boolean capacidad = false ;

        if (cantArticulos >= articulopedido.length) {
            return capacidad;
        }
        
        else{
         articulopedido [cantArticulos++] = a;
         capacidad = true;
         return capacidad;
        }
    }

    public void escribirObservacion(String observacion) {
        this.observaciones = observacion ;
    }

    public String obtenerPedido() {
        String result = "" ;
        result = "Pedido :"+nombre +"\n" + "---------"+"\n* Articulos: " ;
        for (int i = 0; i < cantArticulos ; i++) {
            result += "- " + articulopedido[i] + "\n" ; 
        }
        result += "Observaciones: "+ observaciones ;
        return result ;
    }
    
    public int obtenerNumArticulos() {
        return cantArticulos;
    }

    public articulobase obteneArticulobase(int p) {
        if (p<0 || p >= cantArticulos) {
            return null ;
        }
        else{
            return articulopedido[p] ;
        }
    }

    public pedido obtenerNumArticulos(int j) {
        return null;
    }

}
