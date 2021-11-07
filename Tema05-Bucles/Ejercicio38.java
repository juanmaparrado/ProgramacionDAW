import java.util.Scanner;

public class Ejercicio38{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int altura;
       
        System.out.println("Introduce la altura");
        altura = sc.nextInt();
        
        if (altura%2 != 0) {
            
            
            for (int i = 0; i < altura/2 - 0.5; i++) {

                System.out.println();

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int j = i; j < altura - i ; j++) {
                    System.out.print("*");
                }

            }

            for (int i = 0; i <= altura/2 + 1; i++) {

                for (int j = i; j < altura/2 +1; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k < i*2; k++) {
                    System.out.print("*");
                }

                System.out.println();

            }            
        }
        else{
            System.out.println("Error");
        }
    }    
}