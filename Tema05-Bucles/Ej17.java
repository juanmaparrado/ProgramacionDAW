/*
Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
un número positivo).
*/

public class Ej17 {
    public static void main(String[] args) {
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(System.console().readLine());
    int suma = 0;
    for (int i = 0; i < 100 ; i++) {
        suma= numero + (numero+1);
        numero++ ;
    }
    System.out.print(suma);
    }
}
