package Repaso2;

import java.util.Scanner;

public class PiramidePorosa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h=0;
        int espacios=0;
        char c = '*';



        System.out.println("INTRODUCE LA ALTURA DE LA PIRAMIDE");
        h = s.nextInt();

        System.out.println("INTRODUCE EL CARACTER DE LA PIRAMIDE");
        c = s.next().charAt(0);

        s.close();


        espacios = h-1; 

        System.out.println();

        if (h>0) {
                for (int i = 0; i < h; i++) {
                    
                    for (int j = 0; j < espacios; j++) {
                        System.out.print(" ");
                    }
                    System.out.print(c);
                   
                    for (int j = 0; j < i; j++) {
                        System.out.print(" "+c);
                    }

                   


                    System.out.println();
                    espacios--;
                }

        }
        else{
            System.out.println("Altura erronea");
        }

      
        
    }
}
