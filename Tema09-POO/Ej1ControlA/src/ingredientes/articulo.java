package ingredientes;

public class articulo extends ingredienteBase {

   

    public articulo(String nombre, int cantidad) {
        super(nombre, cantidad);
        
    }
    
    public int stock() {
        return super.mostrarCantidad();
    }

    public boolean gastar(int n) {
        boolean gastar = true;
        if (this.stock()>n) {
            gastar = false;
        }
        else{
            super.cambiarCantidad(this.stock()-n);
            gastar = true;
        }
        return gastar;
    }
}
