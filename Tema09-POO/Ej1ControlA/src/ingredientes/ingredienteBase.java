package ingredientes;

public abstract class ingredienteBase {
    private String nombre;
    private int cantidad;


     public ingredienteBase (String nombre,int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
        
    }

    public String mostrarNombre() {
        return "El ingrediente es : "+ this.nombre;
    }
    
    protected int mostrarCantidad() {
        return cantidad ;         
    }

    public void cambiarCantidad(int cantidadUsuario) {
        cantidad = cantidadUsuario;
    }

    public String datosIngrediente() {
        return nombre+"---> Cantidad: "+cantidad ;
    }

}
