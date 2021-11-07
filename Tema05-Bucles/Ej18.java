        /*Escribe un programa que obtenga los números enteros comprendidos entre dos números
* introducidos por teclado y validados como distintos, el programa debe empezar por
* el menor de los enteros introducidos e ir incrementando de 7 en 7. */
public class Ej18 {
    public static void main(String[] args) {
        System.out.println("Introduce un entero");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el otro entero");
        int num2 = Integer.parseInt(System.console().readLine());

    if (num2<num1){
        int aux = num1;
        num1 = num2;
        num2 = aux;
    }
    for (int i = num1; i < num2; i+=7) {
        System.out.println(i);
    }
    }
}
