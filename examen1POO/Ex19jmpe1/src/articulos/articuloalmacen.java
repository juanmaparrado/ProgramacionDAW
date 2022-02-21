package articulos;

public class articuloalmacen extends articulobase {

    public articuloalmacen(String nombre, int cantidad) {
        super(nombre, cantidad);
    }

    public int obtenerCantidad(){
        return cantidad;
    }
    
}
