package ingredientes;

public class ingrediente extends ingredienteBase {
        
    public ingrediente(String nombre, int cantidad) {
        super(nombre, cantidad);
    }
    public int mostrarCantidad() {
        return super.mostrarCantidad() ; 
    }
}
