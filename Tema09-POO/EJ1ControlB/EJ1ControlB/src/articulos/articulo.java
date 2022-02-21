package articulos;

public class articulo extends articulobase {

    public articulo(String nombre, int cantidad) {
        super(nombre, cantidad);

    }
    public int obtenerCantidad() {
        
        return cantidad;
    }
}
