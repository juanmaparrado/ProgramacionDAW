package Repaso2;

import java.util.Scanner;

public class ej1rec {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String cadena;
        int i;
        do {
            System.out.println("Introduce la cadena que quieres estirar :");
             cadena = s.next();
            System.out.println("Cuanto quieres estirar :");
             i = s.nextInt();
        } while ( i < 0);

        System.out.println(EstirarCadena(cadena, i));



        s.close();
    }

    public static String EstirarCadena(String c , int i) {
        String cadenaEstirada ="";
        int contador = c.length();

        for (int j = 0; j < contador; j++) {
            char caracter = c.charAt(j);

            for (int k = 0; k < i; k++) {
                cadenaEstirada = cadenaEstirada+String.valueOf(caracter);
                
            }
        }
        

        return cadenaEstirada;
        
    }
}