import java.util.Scanner;

public class Ejercicio3numerosExamen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numIntroducido;
        int numero;
        int desplazado ;
        String desplazamiento;
        int longitud = 0 ;
        int cifras = 0 ;

        System.out.println("Este programa da la vuelta a un numero");
        System.out.print("introduce un numero:");
        numIntroducido = s.nextInt();
        numero = numIntroducido;
       
        //para saber la longitud del numero
       while (numero > 0) {
            numero /= 10;
            longitud++;
       }
       do {
        
        System.out.println("Introduce el desplazamiento (derecha,izquierda;salir)");
        desplazamiento = s.nextLine();
        System.out.println("Introduce la cantidad de cifras que desea desplazar");
        cifras = s.nextInt();
        if (cifras>longitud) {
            cifras -= longitud;
        }
        if (desplazamiento.equals("derecha")) {
            
            
        }
        else if (desplazamiento.equals("izquierda")) {
            
        }

       } while (!desplazamiento.equals("salir"));
       s.close();
    }
}
