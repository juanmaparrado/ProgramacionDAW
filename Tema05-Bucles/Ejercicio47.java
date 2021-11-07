import java.util.Scanner;

public class Ejercicio47{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int altura;
        
        System.out.println("Introduce la altura");
        altura = sc.nextInt();
        
        if (altura >= 5 && altura%2 != 0) {
            altura -= 3;
            altura /= 2;
            
            for (int i = 0; i < 6; i++) {
                System.out.print("M");
            }
            
            System.out.println();
            
            for (int i = 0; i < altura; i++) {
                System.out.println("M    M");
            }
            
            for (int i = 0; i < 6; i++) {
                System.out.print("M");
            }
            
            System.out.println();
            
            for (int i = 0; i < altura; i++) {
                System.out.println("M    M");
            }
            
            for (int i = 0; i < 6; i++) {
                System.out.print("M");
            }
        }
        else{
            System.out.println("Error");
        }  
    }
}