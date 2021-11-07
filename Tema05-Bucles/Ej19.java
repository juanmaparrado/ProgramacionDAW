/*Realiza un programa que pinte una pirámide por pantalla. La altura
* se debe pedir por teclado. El carácter con el que se pinta la pirámide
* también se debe pedir por teclado.*/
import java.util.Scanner;
public class Ej19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Introduce el caracter a dibujar");
        char dibujo = s.next().charAt(0);

        System.out.println("Introduce la altura de la piramide");
        int h = s.nextInt();

        int numEspacios = h-1 ;
        int numCaracter = 1;

        s.close();


        for (int i = 0; i < h; i++) {

             //pintar espacios
            for (int j = 1; j<= numEspacios; j++) {
            System.out.print(" ");
            }


            //pintar caracteres
            for (int k = 1; k < numCaracter; k++) {
            System.out.print(dibujo);
            }

            System.out.print("\n");
            
            numCaracter = numCaracter + 2 ;
            numEspacios-- ;
        }

    }
        
 }

