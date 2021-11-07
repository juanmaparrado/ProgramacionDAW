import java.util.Scanner;

public class Ejercicio39{
    public static void main(String[] args) {
        
       
      Scanner sc = new Scanner(System.in);

        int num, factorial;

        System.out.println("Introduce un número");
        num = sc.nextInt();

        factorial = 1;
        
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }
            System.out.println(i + "! = " +factorial);
            
            factorial = 1;
            
        }
    }
}