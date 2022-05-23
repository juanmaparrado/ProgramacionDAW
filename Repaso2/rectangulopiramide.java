package Repaso2;

import java.util.Scanner;

public class rectangulopiramide {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Indique el ancho en triangulos");
        int ancho = s.nextInt();
        System.out.println("Indique el alto en triangulos");
        int alto = s.nextInt();
        s.close();



        //numero filas
        for (int i = 0; i < alto; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int j2 = 0; j2 < ancho; j2++) {
                    for (int k = 0; k < j; k++) {
                        System.out.print("*");
                        
                    }
                    for (int k = 0; k < 4-j; k++) {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                    
                }
            System.out.println();
         }
         System.out.println();
         
        }
     



          
    }
}




