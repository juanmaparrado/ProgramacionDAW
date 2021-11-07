/* 
Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.
*/
public class Ej15 {
    public static void main(String[] args) {
        System.out.println("Introduce la base");
        int base = Integer.parseInt(System.console().readLine());
        int expFinal = Integer.parseInt(System.console().readLine());
        double aux = 1;
        int expinicial=1 ;
        for (int i = 0; i < expFinal ; i++) {
            aux *= base;
            System.out.println(base+" ^ "+expinicial+" = "+aux);
            expinicial++;
        }
    }
}
