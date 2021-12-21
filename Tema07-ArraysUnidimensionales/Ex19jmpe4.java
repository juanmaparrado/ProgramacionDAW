/*JUAN MANUEL PARRADO ESCRIBANO */
import java.util.Scanner;

public class Ex19jmpe4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ancho ;
        int alto ;
        char caracter = '*';
        int numasteriscos = 1;
        int numespacios = 3;
         
        //entrada de datos
        System.out.println("Indique el ancho en triángulos: ");
        ancho = s.nextInt();
        System.out.println("Indique el alto en triángulos: ");
        alto = s.nextInt();
        s.close();  
       
        for (int i = 0; i < alto*4; i++) {

          //para resetear los contadores cuando llega a 0 espacios y 4 asteriscos
              if (i%4 == 0) {
                numespacios = 3;
                numasteriscos = 1;
                System.out.println();
              }

            //pintar el numespacios de la vuelta , los asteriscos y otro espacio mas
            // en la primera vuelta se pinta 3 espacios 1 asterisco y 1 espacio detras

          for (int j = 0; j < ancho; j++) {

            for (int k = 0; k < numespacios ; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numasteriscos ; k++) {
              System.out.print(caracter);
            }
            //espacio entre piramides
            System.out.print(" ");
          }
          numespacios--;
          numasteriscos++;
          //linea vacia
          System.out.println();
        }
    }
}
