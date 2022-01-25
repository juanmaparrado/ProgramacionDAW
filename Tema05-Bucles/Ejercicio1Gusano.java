import java.util.Scanner;

/**
 * Ejercicio1Gusano
 */
public class Ejercicio1Gusano {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa dibuja un gusano en la pantalla");
        System.out.println("Controles: j=abajo-izquierda // k=abajo // l=abajo-derecha (Seguido de ENTER)");
        System.out.println("Pulse s para salir");

        char movimiento;
        int numEspacios = 0;
       
        do {
                for (int i = 0; i <= numEspacios; i++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int i = numEspacios; i < 20; i++) {
                    System.out.print(" ");
                }

                System.out.print("¿j,k,l,s?: ");
                movimiento = s.next().charAt(0);
             
                switch (movimiento) {
                    case 'j':
                        if (numEspacios>0) {
                            numEspacios--;
                        }
                        break;

                    case 'l':
                        if (numEspacios<9) {
                            numEspacios++;
                        }
                    break;
                    default:
                        break;
                    }


                    
        } while (movimiento != 's');
        s.close();
    }
}