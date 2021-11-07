import java.util.Scanner;

public class Ejercicio41{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num, numRev = 0, aux, contadorPar = 0, contadorImpar = 0;
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
            
            if (numRev%2 == 0) {
                contadorPar++;
            }
            else{
                contadorImpar++;
            }
            
            numRev /= 10;
        }  
        
        System.out.println("Números pares: " + contadorPar);
        System.out.println("Números impares: " + contadorImpar);
    }
}