package arraylist;


public class Empleado {
        private String nombre;
        private int edad ;
        private double salario ;

    //constructor
    public Empleado (String nombre,int edad, double salario) {
        this.nombre= nombre ;
        this.edad = edad;
        this.salario= salario;
    }

    public String DameDatos() {
        return "el empleado se llama " + nombre + ". Tiene "+edad + " años." + " Y un salario de "+ salario;
    }



}

