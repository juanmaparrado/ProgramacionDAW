package Ejercicio1;

public class Empleado implements Trabajadores {

    //ATRIBUTOS
    private int id ;
    private static int idSiguiente = 1;
    private final String nombre ;
    private double sueldo;
    private String fechaAlta;
    
//CONSTRUCTOR 
    public Empleado(String nom,int s,String f){
        this.nombre = nom;
        this.sueldo = s;
        this.fechaAlta = f;
        id = idSiguiente;
        idSiguiente++;
        
    }

    public Empleado (String nombre){
        this(nombre, 2000, "01/01/2000");
        

    }
 //GETTER
    public String darNombre(){ 
        return nombre + " ID : "+id;
    }

    public double darSueldo(){
        return sueldo;

    }
    public String darFecha(){
        return fechaAlta;
    }
    //setter
    public void subirSueldo(double porcentaje){ 

        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }

    public double establecerBonus(double dinero) {

        return Trabajadores.bonusBase+dinero;
    }
}
