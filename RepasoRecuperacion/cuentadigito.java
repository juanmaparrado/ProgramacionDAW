import java.util.Scanner;

public class cuentadigito {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long numero ;
        int[] digitos = new int[10];

        System.out.println("Introduzca un numero entero ");
        numero = s.nextLong();
        s.close();
        //rellena las diez posiciones
        
        for (int i = 0; i < 10; i++) {
            digitos[i] = 0 ;
        }
        //establece en la posicion del array el numro de veces que aparece
        do {
            int cifra = (int) numero % 10 ;
            digitos[cifra]++ ;
            numero /= 10 ;

        } while (numero>0);

        //muestra por pantalla

        for (int i = 0; i < 10; i++) {
            if (digitos[i] > 0) {
                System.out.println("El digito '"+i+"' aparece "+digitos[i]+" veces.");
            }
        }

    }
    
    


}
