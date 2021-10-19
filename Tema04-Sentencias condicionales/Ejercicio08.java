import java.util.Scanner;

public class Ejercicio08 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.print("Introduce la primera nota (sobre 10): ");
   double notaA = s.nextDouble ();
   System.out.print("Introduce la segunda nota (sobre 10): ");
   double notaB = s.nextDouble ();
   System.out.print("Introduce la tercera nota (sobre 10): ");
   double notaC = s.nextDouble ();
   
   double media = (notaA + notaB + notaC)/3;
   String notaPalabra;
   int notaM = 0;
   
   if (media >= 0) {
     if (media < 5) {
       notaM = 1;
     }
   } 
   
   if (media >= 5) {
     if (media < 6) {
       notaM = 2;
     }
   } 
   
   if (media >= 6) {
     if (media < 7) {
       notaM = 3;
     }
   } 
   
   if (media >= 7) {
     if (media < 9) {
       notaM = 4;
     }
   } 
   
   if (media >= 9) {
     if (media <= 10) {
       notaM = 5;
     }
   } 
   
   switch (notaM) {
     
     case 1:
     notaPalabra = "INSUFICIENTE";
     System.out.println("La media de las tres notas es de: " + media + ". " + notaPalabra + ".");
     break;
     
     case 2:
     notaPalabra = "SUFICIENTE";
     System.out.println("La media de las tres notas es de: " + media + ". " + notaPalabra + ".");
     break;
     
     case 3:
     notaPalabra = "BIEN";
     System.out.println("La media de las tres notas es de: " + media + ". " + notaPalabra + ".");
     break;
     
     case 4:
     notaPalabra = "NOTABLE";
     System.out.println("La media de las tres notas es de: " + media + ". " + notaPalabra + ".");
     break;
     
     case 5:
     notaPalabra = "SOBRESALIENTE";
     System.out.println("La media de las tres notas es de: " + media + ". " + notaPalabra + ".");
     break;
     
     default:
     System.out.println("Esta nota no es posible");
     
   }
     
   
   
    
  }
}


