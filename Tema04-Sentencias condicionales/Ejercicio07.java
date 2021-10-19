import java.util.Scanner;

public class Ejercicio07 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.print("Introduce la primera nota (sobre 10): ");
   double notaA = s.nextDouble ();
   System.out.print("Introduce la segunda nota (sobre 10): ");
   double notaB = s.nextDouble ();
   System.out.print("Introduce la tercera nota (sobre 10): ");
   double notaC = s.nextDouble ();
   
   double media = (notaA + notaB + notaC)/3;
   
   if ((media > 10) || (media < 0)) {
    System.out.println("La nota media " + media + " no es posible.");
   }
   
   else {
   System.out.println("La media de las tres notas es de: " + media);
  }
  
 }
}


