package Ejercicio1;

public class Uso_Empleado {
    public static void main(String[] args) {

        Jefatura jefeRRHH = new Jefatura("Juan", 8000, "23/01/1995");

        jefeRRHH.establecerIncentivo(1050);

        Empleado[] misEmpleados = new Empleado[6] ; 
        misEmpleados[0] = new Empleado("Paco Rodríguez",2000,"05/01/1997") ;
        misEmpleados[1] = new Empleado("India Gutierrez",2500,"25/05/2007") ;
        misEmpleados[2] = new Empleado("Jose Pou",4500,"12/10/2000") ;
        misEmpleados[3] = new Empleado("Antonio");
        misEmpleados[4] = jefeRRHH;
        misEmpleados[5] = new Jefatura("Maria KILL", 9000, "30/02/2010");
        
        //casting
        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
        jefaFinanzas.establecerIncentivo(5000);
       

       
        //bucle para subir el sueldo a cada empleado

        for (int i = 0; i < 6; i++) {
            misEmpleados[i].subirSueldo(5);
        }

        for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("Nombre : "+ misEmpleados[i].darNombre() + " Sueldo : " + misEmpleados[i].darSueldo() + " Fecha de alta : "+ misEmpleados[i].darFecha());
        }
    
    }
}
