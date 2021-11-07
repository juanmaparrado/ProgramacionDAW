/* Igual que el ejercicio anterior pero esta vez se debe pintar una
* pirámide hueca.*/
import java.util.Scanner;
public class Ej20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el caracter a dibujar");
        char c = s.next().charAt(0);

        System.out.println("Introduce la altura de la piramide");
        int h = s.nextInt();
        int numEspacios = h-1;
        int numEspaciosInt = h+1;
        //vueltas
        for (int i = 1; i < h; i++) {

          //espacios exterior
          for (int j = 1; j < numEspacios; j++) {
            System.out.print(" ");
          }
          //caracter
          System.out.print(c);
          //espacios interiores
          for (int k = 1; k < numEspaciosInt; k++) {
            System.out.print(" ");
          }
         //segunda fila caracter
         System.out.print(c);
          System.out.println();
          numEspacios--;
          numEspaciosInt+=2;
        }  
        //base
        for (int i = 0; i < h; i++) {
          System.out.print(c+"  ");
        }
        System.out.println();
         s.close();

  }
}

        
    
