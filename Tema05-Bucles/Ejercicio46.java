import java.util.Scanner;

public class Ejercicio46{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int anchura, altura;
        
        System.out.println("Introduce la anchura");
        anchura = sc.nextInt();
        
        System.out.println("Introduce la altura");
        altura = sc.nextInt();
        
        if (anchura >= 2 && altura >= 2) {
            for (int i = 0; i < anchura; i++) {
                System.out.print("* ");
            }
        
            System.out.println("");

            for (int i = 0; i < altura - 2; i++) {
                System.out.print("*");

                for (int j = 0; j < anchura * 2 - 3; j++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }

            for (int i = 0; i < anchura; i++) {
                System.out.print("* ");
            }
        }
        else{
            System.out.println("Error");
        }  
    }
}