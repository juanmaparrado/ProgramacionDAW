import java.util.Scanner;

/**
 * Ejercicio2CartaFrancesa
 */
public class Ejercicio2CartaFrancesa {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palo="" ;
        String carta="";
        int numeroPalo = (int)(((Math.random())*4)+1);
        int numeroCarta = (int)((Math.random()*13)+1);
       
        switch (numeroPalo) {
            case 1:
                palo = "picas";
                break;
            case 2 :
                palo = "corazones";
                break;
            case 3 :
                palo = "treboles";
                break;
            case 4 :
                palo = "diamantes";
                break;
            default:
            break;
        }

        switch (numeroCarta) {
            case 1:
                carta = "As";
                break;
            case 11:
                carta="J";
                break;
            case 12:
                carta="Q";
                break;
            case 13:
                carta="K";
                break;
            default:
                carta = String.valueOf(numeroCarta);
                break;
        }
        System.out.println("La carta generada es: "+carta+" de "+palo);
        s.close();
    }
}