package Ejercicio1;

public class Jefatura extends Empleado {

    //ATRIBUTO
    private double incentivo;

    public Jefatura(String nom , int s,String f) {

        super(nom, s, f);

    }
    public void establecerIncentivo(double incentivo){

        this.incentivo = incentivo;
    }

    public double darSueldo(){
        double sueldoJefe = super.darSueldo();
        return sueldoJefe + incentivo;
    }

}

