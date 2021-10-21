public class Ej24 {
    public static void main(String[] args) throws Exception {
        int cargo = 0;
        int diaViaje;
       int sueldoBase = 950;
       int sueldoBase1 = 0;
       int estadoCivil;
       double irpf=0.0 ;
       double sueldo;
       
       System.out.println("1-Programador Junior");
        System.out.println("2-Programador senior");
        System.out.println("3-Jefe de proyecto");
        System.out.println("¿Cual es el cargo del empleado(1-3)?");
        cargo = Integer.parseInt(System.console().readLine());
        
        System.out.println("¿cuantos dias ha estado de viaje visitando clientes?");
         diaViaje = Integer.parseInt(System.console().readLine());

        System.out.println("Introduzca su estado civil (1-Soltero,2-Casado)");
        estadoCivil = Integer.parseInt(System.console().readLine());
        /*
        El sueldo por defecto es el mas bajo 
        */
        switch (cargo) {
            case 1:
                break;
            case 2 :
            sueldoBase = 1200;
            break;
            case 3 :
            sueldoBase = 1600;
            break;
            default:
            System.out.println("El cargo introducido es incorrecto");
                break;
        }
        System.out.println("Sueldo base       "+sueldoBase);
        if(diaViaje > 0 ) {
            sueldoBase1 = sueldoBase + (diaViaje*30);
            System.out.println("Dietas            "+(diaViaje*30));
        }
        else {
            sueldoBase1 = sueldoBase ;
            }
            
        switch (estadoCivil) {
            case 1:
              irpf=0.25;
              estadoCivil=25;
                break;
            case 2 :
                irpf=0.20;
                estadoCivil = 20;
                break;
            default:
                irpf=0;
                estadoCivil = 0;
                break;
        }
            sueldo = sueldoBase1-(sueldoBase1*irpf);
           
        
        
        
        System.out.println("-------------------");
        System.out.println("Sueldo bruto       "+sueldoBase1);
        System.out.println("IRPF               "+estadoCivil+"%");
        System.out.println("Sueldo NETO       "+sueldo );

    
    
    }

}
