
import java.util.Scanner;

public class PiramidePorosDown {
    public static void main(String[] args) {
        int h ;
        char c = '*' ;
        int espacios = 0;
        int caracter = 0;
        


        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura de la pirámide: ");
        h = s.nextInt();

        System.out.println("Introduzca el caracter de relleno: ");
        c = s.next().charAt(0);
        s.close();

        caracter = h-1;
        
        System.out.println();

        if (h>0) {
            //nº piso 
             for (int i = 0; i < h; i++) {

                if (espacios<h) {
                    //pintar espacios
                    for (int j = 0; j < espacios; j++) {
                        System.out.print(" ");
                    }

                    System.out.print(c);

                    //pintar caracteres
                    for (int j = 0; j < caracter; j++) {
                        System.out.print(" "+c);
                    
                    }
                }


                System.out.println();
                espacios++ ;
                caracter-- ;
        }   
       
    
    }else{
            System.out.println("La altura introducida no es valida");
        }


    }
    
}