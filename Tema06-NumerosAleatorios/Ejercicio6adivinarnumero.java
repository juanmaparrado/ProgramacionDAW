import java.util.Scanner;
/*
* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
* adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
* programa dirá cuántas oportunidades quedan y si el número introducido es menor o
* mayor que el que ha pensado. 
*/
public class Ejercicio6adivinarnumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nAleatorio = (int)((Math.random())*101);
        int intentos=5;
        int nIntroducido;
        boolean acertado = false;

        do {
             System.out.println("Introduce el numero que piensas ");
            nIntroducido = s.nextInt();
            intentos--;
           
            if ((nIntroducido > nAleatorio) && (intentos > 0)) {
                System.out.println("El numero es menor a este");
            }
            if ((nIntroducido < nAleatorio) && (intentos > 0)) {
                System.out.println("El numero es mayor a este");
            } 
            if (nIntroducido == nAleatorio) {
                acertado = true;
                System.out.println("ENHORABUENA HAS ENCONTRADO EL NUMERO ");
            }

        } while ((!acertado) && (intentos>0) );

        if (!acertado) {
           System.out.println("Lo sentimos no ha conseguido adivinar el numero "+nAleatorio); 
        }
        s.close();
    }
}
