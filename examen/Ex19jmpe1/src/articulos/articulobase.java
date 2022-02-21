package articulos;

public class articulobase {
    private String nombre ;
    protected int cantidad;

    public articulobase(String nombre,int cantidad){
        this.nombre = nombre ;
        this.cantidad = cantidad ;
    }

    public String obtenerNombre() {
        return nombre ;
    }
    protected int obtenerCantidad() {
        return cantidad;
    }

    protected void cambiarCantidad(int c) {
        this.cantidad = c ;
    }
    @Override
    public String toString(){
        return nombre + "-> Cantidad: "+cantidad;
    }
}
