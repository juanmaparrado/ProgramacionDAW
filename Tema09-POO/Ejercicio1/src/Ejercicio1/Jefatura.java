package Ejercicio1;

public class Jefatura extends Empleado implements Jefes{

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
    
    public String tomarDecisiones(String decision) {
        
        return "Un miembro de la direccion ha tomado la decision de "+decision;
    }
    
    public double establecerBonus(double dinero) {
        double prima = 2000; //por que son jefes
        return Trabajadores.bonusBase + dinero + prima;
    }

    

}

