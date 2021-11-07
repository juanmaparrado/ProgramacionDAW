import java.util.Scanner;
/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno. */
public class Ej31L {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int alturaIntroducida;
        int longitud;
        char caracter = '*' ;
        System.out.println("Introduce la altura de la L ");
        alturaIntroducida = s.nextInt();
        longitud = alturaIntroducida/2 ;
        
            
            for (int i = 0; i < alturaIntroducida; i++) {
                System.out.println(caracter);
            }
            for (int i = 0; i < longitud; i++) {
                System.out.print(caracter + " ");   
            }

        s.close();
    }
}
