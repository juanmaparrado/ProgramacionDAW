/* Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
*/
public class Ej16 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero para comprobar si es primo");
        int num =Integer.parseInt(System.console().readLine());
        boolean esPrimo = true;
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
            esPrimo = false; 
            }
        }
        if (esPrimo) {
            System.out.println("El numero "+num+" es primo");
        } else {
            System.out.println("El numero "+num+" no es primo");
        }
    }
}
