import java.util.Scanner;

public class Ejercicio40{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int altura;

        System.out.println("Introduzca la altura");
        altura = sc.nextInt();

        if (altura < 3 || altura%2 == 0) {
            System.out.println("Error");
        }
        else{
            for (int i = 0; i < altura/2 - 0.5; i++) {
            
                for (int j = i; j < altura/2; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int j = 0; j < i*2 - 1; j++) {
                    System.out.print(" ");
                }

                if (i != 0) {
                    System.out.print("*");
                }


                System.out.println();
            
            }
        
            for (int i = 0; i < altura/2 + 0.5; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int j = i; j < altura/2 - i - 2; j++) {
                    System.out.print(" ");
                }

                if (i != altura/2 ) {
                    System.out.print("*");
                } 

                System.out.println();

            }
        }   
    }
}