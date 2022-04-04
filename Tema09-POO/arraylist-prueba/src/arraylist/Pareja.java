package arraylist;

public class Pareja<T>{
    private T primero;

    public Pareja(){

          primero = null;

    }

    public void setPrimero(T nuevoValor) {
        primero = nuevoValor;
    }

    public static void imprimirTrabajador(Pareja<Empleado> p){
        Empleado primero = p.getPrimero();
        System.out.println(primero);
    }

    public  T getPrimero(){
        return primero;
    }

  
}
