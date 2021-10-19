import java.util.Scanner;

public class Ejercicio10 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
    
   System.out.print("Introduce el mes que naciste: ");
   String mes = s.nextLine ();
   System.out.print("Introduce el dia que naciste: ");
   int dia = s.nextInt ();
   
   int fecha = 0;
   String horoscopo;
   
   if (mes.equals("enero")) {
     if (dia<= 31) {
       if (dia> 19) {
       fecha = 11;
       }
      }
     if (dia<= 19) {
       if (dia>= 1) {
       fecha = 10;
       }
      }
    }
    
    if (mes.equals("febrero")) {
     if (dia<= 28) {
       if (dia> 18) {
       fecha = 12;
       }
      }
     if (dia<= 18) {
       if (dia>= 1) {
       fecha = 11;
       }
      }
    }
    
    if (mes.equals("marzo")) {
     if (dia<= 31) {
       if (dia> 20) {
       fecha = 1;
       }
      }
     if (dia<= 20) {
       if (dia>= 1) {
       fecha = 12;
       }
      }
    }
    
    if (mes.equals("abril")) {
     if (dia<= 30) {
       if (dia> 19) {
       fecha = 2;
       }
      }
     if (dia<= 19) {
       if (dia>= 1) {
       fecha = 1;
       }
      }
    }
    
    if (mes.equals("mayo")) {
     if (dia<= 31) {
       if (dia> 20) {
       fecha = 3;
       }
      }
     if (dia<= 20) {
       if (dia>= 1) {
       fecha = 2;
       }
      }
    }
    
    if (mes.equals("junio")) {
     if (dia<= 30) {
       if (dia> 20) {
       fecha = 4;
       }
      }
     if (dia<= 20) {
       if (dia>= 1) {
       fecha = 3;
       }
      }
    }
    
    if (mes.equals("julio")) {
     if (dia<= 31) {
       if (dia> 22) {
       fecha = 5;
       }
      }
     if (dia<= 22) {
       if (dia>= 1) {
       fecha = 4;
       }
      }
    }
    
    if (mes.equals("agosto")) {
     if (dia<= 31) {
       if (dia> 22) {
       fecha = 6;
       }
      }
     if (dia<= 22) {
       if (dia>= 1) {
       fecha = 5;
       }
      }
    }
    
    if (mes.equals("septiembre")) {
     if (dia<= 30) {
       if (dia> 22) {
       fecha = 7;
       }
      }
     if (dia<= 22) {
       if (dia>= 1) {
       fecha = 6;
       }
      }
    }
    
    if (mes.equals("octubre")) {
     if (dia<= 31) {
       if (dia> 22) {
       fecha = 8;
       }
      }
     if (dia<= 22) {
       if (dia>= 1) {
       fecha = 7;
       }
      }
    }
    
    if (mes.equals("noviembre")) {
     if (dia<= 30) {
       if (dia> 21) {
       fecha = 9;
       }
      }
     if (dia<= 21) {
       if (dia>= 1) {
       fecha = 8;
       }
      }
    }
    
    if (mes.equals("diciembre")) {
     if (dia<= 31) {
       if (dia> 21) {
       fecha = 10;
       }
      }
     if (dia<= 21) {
       if (dia>= 1) {
       fecha = 9;
       }
      }
    }
   
   
   switch (fecha) {
     
     case 1:
     horoscopo = "Aries";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 2:
     horoscopo = "Tauro";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 3:
     horoscopo = "Geminis";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 4:
     horoscopo = "Cancer";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 5:
     horoscopo = "Leo";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 6:
     horoscopo = "Virgo";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 7:
     horoscopo = "Libra";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 8:
     horoscopo = "Escorpio";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 9:
     horoscopo = "Sagitario";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 10:
     horoscopo = "Capricornio";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 11:
     horoscopo = "Acuario";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     case 12:
     horoscopo = "Piscis";
     System.out.println("Tu signo del horoscopo es: " + horoscopo + ".");
     break;
     
     default:
     System.out.println("Este mes o dia no existe.");
     
   }
     
   
   
    
  }
}
