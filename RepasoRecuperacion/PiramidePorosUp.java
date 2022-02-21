
import java.util.Scanner;

public class PiramidePorosUp {
    public static void main(String[] args) {
        int h ;
        char c = '*' ;
        int espacios;
        


        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura de la pirámide: ") ;
        h = s.nextInt();

        System.out.println("Introduzca el caracter de relleno: ");
        c = s.next().charAt(0);

        s.close(); 
        
        espacios = h-1;
        System.out.println();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            
            System.out.print(c);

            for (int j = 0; j < i; j++) {
                System.out.print(" "+c);
            }



            System.out.println();
            espacios-- ;
        }
    }
    
}
