import java.util.Scanner;

public class Ejercicio37{
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        
        int num, numRev = 0, aux;
        int longitud = 0;
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
         
        while (num > 0) {
            numRev = (numRev * 10) + (num % 10);
            num /= 10;
            longitud++;
        } 
        
        for (int i = 0; i < longitud; i++) {
            
            aux = numRev%10;
            
            for (int j = 0; j < aux; j++) {
                System.out.print("| ");
            }
            if (numRev > 10) {
                System.out.print("- ");
            }
            
            numRev /= 10;
        }
    }
}