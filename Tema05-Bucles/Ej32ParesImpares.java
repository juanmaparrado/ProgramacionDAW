import java.util.Scanner;

/**
 * 
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
 */
public class Ej32ParesImpares {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long numeroIntr;
        long digitos ;
        long reves = 0;
        int longitud = 0;
        long sumaPares = 0 ;

        System.out.println("Introduce un numero entero positivo");
        numeroIntr = s.nextLong(); 
        s.close();
        while (numeroIntr > 0) {
            reves = (reves*10)+(numeroIntr%10);
            numeroIntr /= 10; 
            longitud++ ;
            }
        for (int i = 0; i < longitud ; i++) {
            digitos = (reves%10);
            if ((digitos%2)==0) {
                System.out.print(digitos+" ");
                sumaPares += digitos ;
            }
            reves /= 10;
            
        }                          
            System.out.println( "La suma de los digitos es "+sumaPares);
           }
        
        }
       
