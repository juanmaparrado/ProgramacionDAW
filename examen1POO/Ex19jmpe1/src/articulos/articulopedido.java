package articulos;

public class articulopedido extends articulobase {

    

    public articulopedido(String nombre, int cantidad) {
        super(nombre, cantidad);
        
    }

    public int stock() {
        return super.obtenerCantidad();
    }

    public boolean quitarArticulo(int c) {
        boolean stock = false;
        if (c <= cantidad) {
            return stock;
        }
        else{
            stock = true ;
            cantidad-- ;
        }
        return stock;
    }
    
}
