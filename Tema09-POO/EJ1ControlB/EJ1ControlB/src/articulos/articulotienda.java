package articulos;

public class articulotienda extends articulobase {
    private int cantidadAlmacen = 0;

    public articulotienda(String nombre, int cantidad) {
        super(nombre, cantidad);
        cantidadAlmacen++ ;
    }
    public int stock() {
        return cantidadAlmacen ;
    }

    public boolean quitarCantidad(int c) {
        boolean stock = false ;
        if (c <= cantidad) {
            return stock;
        } else {
           stock = true ;
           cantidad--;
        }
        return stock;
    }
}
