import java.util.Scanner;

public class cuentadigito {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long numero ;
        int[] digitos = new int[10];

        System.out.println("Introduzca un numero entero ");
        numero = s.nextLong();
        s.close();

        for (int i = 0; i < 10; i++) {
            digitos[i] = 0 ;
        }
        do {
            int cifra = (int) numero % 10 ;
            digitos[cifra]++ ;
            numero /= 10 ;

        } while (numero>0);

        for (int i = 0; i < 10; i++) {
            if (digitos[i] > 0) {
                System.out.println("El digito '"+i+"' aparece "+digitos[i]+" veces.");
            }
        }

    }
    
    


}
