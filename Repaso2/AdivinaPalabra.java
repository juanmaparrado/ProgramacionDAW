package Repaso2;

import java.util.Scanner;

public class AdivinaPalabra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] palabras = {"hola","leon","patata","desarrollo"};
        String elegida,desordenada = "";
        
        String juego;

        elegida = palabras[(int)(Math.random()*palabras.length)];


        for (int i = 0; i < elegida.length(); i++) {
            if (Math.random()*2 >= 1) 
                desordenada = desordenada+elegida.charAt(i);
            else
                desordenada = ""+ elegida.charAt(i)+desordenada;
            
        }


        int intentos = 0;
        boolean encontrada = false;


        do{
            System.out.println("TIENE "+(5-intentos)+" intentos. diga la palabra con las letras "+desordenada);
            juego = s.next();

            if (juego.equals(elegida)) 
                encontrada = true;
                intentos++;

            
        }while (intentos<5 && !encontrada);
        s.close();

        if (encontrada) {
            System.out.println("Felicidades encontraste la palabra.");
        }else{
            System.out.println(" la palabra era:  "+elegida);
        }

        

      
    }
}
