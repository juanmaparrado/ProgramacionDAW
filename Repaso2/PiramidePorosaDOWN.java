package Repaso2;

import java.util.Scanner;

public class PiramidePorosaDOWN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int altura=0;
        int espacios=0;
        char c = '*';



        System.out.println("INTRODUCE LA ALTURA DE LA PIRAMIDE");
        altura = s.nextInt();

        System.out.println("INTRODUCE EL CARACTER DE LA PIRAMIDE");
        c = s.next().charAt(0);

        s.close();
        int caracter = altura-1;

        
        System.out.println();

        for (int i = 0; i < altura; i++) {
            
            System.out.print(c);
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            for (int j = 0; j > caracter; j++) {
                System.out.print(" ");
            }
            


            espacios++;
            
            System.out.println();
        }



         
    }
}
