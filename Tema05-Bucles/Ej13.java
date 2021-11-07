/*Ejercicio 13
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.

*/
public class Ej13 {
    public static void main(String[] args) {
       int numero = 0;
        System.out.println("Este programa determina de 10 numeros cuantos son positivos y cuantos negativos");
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Introduce el numero");
             numero = Integer.parseInt(System.console().readLine());
             if (numero < 0){
                System.out.println("El numero introducido es negativo "+numero);
            }
            else{
                System.out.println("El numero introducido es positivo "+numero);
            } 
        }
       
    } 
}

