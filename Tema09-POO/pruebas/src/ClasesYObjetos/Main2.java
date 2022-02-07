package ClasesYObjetos;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = s.nextInt();
        System.out.println("Introduce un numero");
        int num2 = s.nextInt();
        s.close();

        Operacion2 op1 = new Operacion2();

       int suma = op1.sumar(num1, num2);
       int multiplicacion = op1.multiplicar(num1, num2);
       int resta = op1.restar(num1, num2);
       float division =  op1.dividir(num1, num2);
        op1.mostrarResultado(suma, resta, division, multiplicacion);
    }
}
