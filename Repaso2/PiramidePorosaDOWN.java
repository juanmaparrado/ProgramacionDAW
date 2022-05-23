package Repaso2;

import java.util.Scanner;

public class PiramidePorosaDOWN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h=0;
      int espacios = 0;
        char c = '*';



        System.out.println("INTRODUCE LA ALTURA DE LA PIRAMIDE");
        h = s.nextInt();

        System.out.println("INTRODUCE EL CARACTER DE LA PIRAMIDE");
        c = s.next().charAt(0);

        s.close();
        int caracter = h-1;

        
        System.out.println();


        for (int i = 0; i < h; i++) {
           /*numero de vueltas es decir de pisos */ 
           
            //pintar espacios 
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            //mitad piramide
            System.out.print(c);

            //pintar caracteres
            for (int j = 0; j < caracter; j++) {
                System.out.print(" "+c);
            }

            System.out.println();
            espacios++;
            caracter--;
        }



         
    }
}
