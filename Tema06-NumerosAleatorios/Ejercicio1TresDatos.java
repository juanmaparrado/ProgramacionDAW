import java.util.Scanner;
/**
 * Ejercicio1TresDatos
 */
public class Ejercicio1TresDatos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;
        int numero ;
        for (int i = 0; i < 3; i++) {
            numero= (int)(Math.random()*10+1);
            System.out.print(numero+" ");
            suma += numero;
        }
        System.out.println("La suma de los numeros es : "+suma );
        s.close();
    }
}