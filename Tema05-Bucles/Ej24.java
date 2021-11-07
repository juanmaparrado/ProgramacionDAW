import java.util.Scanner ; 

public class Ej24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Introduce la altura de la piramide");
        int h = s.nextInt();
        int altura = 1;
        int numEspacios = h-1 ;
        
        s.close();
        
        
        for (int i = 0; i < h; i++) {
        
         //pintar espacios
            for (int j = 1; j<= numEspacios; j++) {
            System.out.print(" ");
            }
        
        
          //pintar caracteres
            for (int k = 1; k < altura; k++) {
            System.out.print(k);
		}
            for (int k = altura ; k > 0;k--){
            System.out.print(k);
        }
        
        System.out.println();
        ;      
        numEspacios-- ;
        altura++;
        }
        
            }
    }

