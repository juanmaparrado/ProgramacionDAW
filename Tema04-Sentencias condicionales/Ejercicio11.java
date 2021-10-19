import java.util.Scanner;

public class Ejercicio11 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.print("Introduce la hora en formato de 24 horas: ");
   int hora = s.nextInt ();
   System.out.print("Introduce los minutos: ");
   int minutos = s.nextInt ();
   
   int tiempoResMin, tiempoResHora;

   tiempoResMin = 60 - minutos;
   tiempoResHora = 24 - hora;
   
   if (tiempoResMin > 60) {
     if (tiempoResMin < 0) {
      System.out.println("Valor incorrecto introducido.");
     }
   }
   
   if (tiempoResHora > 24) {
     if (tiempoResHora < 0) {
      System.out.println("Valor incorrecto introducido.");
     }
   }
   else {
     System.out.println("Faltan " + tiempoResHora + " horas con " + tiempoResMin + " minutos para la medianoche.");
   }
     
   
    
  }
}


