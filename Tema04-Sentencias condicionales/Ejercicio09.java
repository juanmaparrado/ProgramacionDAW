import java.util.Scanner;

public class Ejercicio09 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.print("Introduce un valor para la variable a: ");
   double varA = s.nextDouble ();
   System.out.print("Introduce un valor para la variable b: ");
   double varB = s.nextDouble ();
   System.out.print("Introduce un valor para la variable c: ");
   double varC = s.nextDouble ();
   
   double valorX1, valorX2;
   valorX1 = (-(varB) + Math.sqrt(((Math.pow(varB, 2)) - (4 * varA * varC))))/(2 * varA);
   valorX2 = (-(varB) - Math.sqrt(((Math.pow(varB, 2)) - (4 * varA * varC))))/(2 * varA);
   
   System.out.println("Los valores de x son: " + valorX1 + " y " + valorX2 + ".");
    
  }
}

