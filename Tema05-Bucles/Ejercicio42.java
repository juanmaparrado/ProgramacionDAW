import java.util.Scanner;

public class Ejercicio42{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        boolean primo = true;
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 2; j < num/2; j++) {
                if (num%j == 0) {
                    primo = false;
                }
            }
            
            if (primo) {
                System.out.println("El " + num + " es primo");
            }
            else{
                System.out.println("El " + num + " no es primo");
            }
            
            num++;
            primo = true;
        }  
    }
}