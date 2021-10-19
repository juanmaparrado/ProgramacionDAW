import java.util.Scanner;

public class Ejercicio06 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.print("Introduce un valor para la altura en metros: ");
   double altura = s.nextDouble();
   
   double tiempo;
   tiempo = (Math.sqrt((2 * altura)/9.81));
   
   System.out.println("El objeto tardara en caer: " + tiempo + "segundos al suelo");
    
  }
}
