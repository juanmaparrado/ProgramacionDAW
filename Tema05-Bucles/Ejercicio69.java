import java.util.Scanner;

public class Ejercicio69{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String espacio = " ", espacio2 = "    ";
        int altura;
       
        System.out.println("Introduce la altura de la pirámide");
        altura = sc.nextInt();
        
        
        
        for (int i = 1; i <= altura; i++) {
            
            for (int j = i; j < altura; j++) {
                System.out.print(espacio);
            }
            
            if(i%2 != 0){
                for (int j = 1; j < 5 + i*2 ; j++) {
                    System.out.print("*");
                }
            }else{
                for (int j = 0; j < i; j++) {                   
                    System.out.print("*");
                }
                
                System.out.print(espacio2);
                
                for (int j = 0; j < i; j++) {                   
                    System.out.print("*");
                }
            }   
            
            System.out.println();
            
        }
        
    }
}