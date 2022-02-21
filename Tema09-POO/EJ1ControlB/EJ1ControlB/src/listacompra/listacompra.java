package listacompra;

import articulos.articulo;

public class listacompra {
    private String nombre ; 
    private int cantArticulos;
    private articulo[]  articulo ;
    private String observaciones ;

    public  listacompra(String nombre,int articulosMax ) {
        this.nombre = nombre ;
        this.cantArticulos =0;
        this.articulo = new articulo[articulosMax];
        this.observaciones = "";
    }

    public boolean añadirArticulo( articulo a) {
       boolean capacidad = false ;

       if (cantArticulos >= articulo.length) {
           return capacidad;
       }
       
       else{
        articulo [cantArticulos++] = a;
        capacidad = true;
        return capacidad;
       }
        
    }

    public void escribircomentario(String comentUsuario) {
        this.observaciones = comentUsuario;
    }

    public String obtenerLista(){
        String resultado = "";
        resultado += "Lista: "+nombre+ "\n"+"-------"+"\n"+"* Articulos:" ;
        for (int i = 0; i < cantArticulos; i++) {
            resultado += "- " + articulo[i]+ "\n";
        }
        resultado += "Comentario: "+observaciones ;
        return resultado;
    }

    public int obtenerNumArticulos() {
        return cantArticulos;
    }

    public articulo obtenerArticulo(int p) {
        if (p<0 || p>= cantArticulos) {
            return null;
        }
        else{
        return articulo[p];
        }
    }


}
