import java.util.Scanner;

public class Ej310numinverso {
    public static void main(String[] args) {
        int numero [] = new int[10];
       System.out.print("Introduce diez numeros");
        for (int i = 0; i < 10 ; i++) {
            numero [i] = Integer.parseInt(System.console().readLine());
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(numero[i]);
        }

      
    }
}
