import java.nio.channels.NetworkChannel;
import java.util.Scanner;
public class Ej08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numIntroducido = 0;
        int multiplicador = 0;
        int contador = 0;
        int resultado = 0;
        System.out.println("Introduce el numero de la tabla de multiplicar que deseas ver");
        numIntroducido = s.nextInt();
        while (contador < 10) {
            multiplicador++;
            resultado = numIntroducido*multiplicador;
            System.out.println(numIntroducido+" * "+multiplicador+" = "+resultado);
            contador++;   
        }
        s.close();
    }
}
