/*Juan Manuel Parrado Escribano */

import java.util.Scanner;

public class Ex19jmpe1 {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        int filas = 22;
        int columnas = 22;
        int minimo;
        int maximo;
        
        

        //pedida de datos fila y columna
            while (filas < 1 || filas > 20) {
                System.out.println("Intoduce el nº de filas [1-20]");
            filas = s.nextInt();
            if (filas > 1 && filas < 20) {
             while (columnas < 1 || columnas > 20) {
                System.out.println("Intoduce el nº de columnas [1-20]");
                columnas = s.nextInt();
            if (columnas > 1 && columnas < 20) {

            }   

        

        int matriz [] [] = new int [filas] [columnas];
        int intervalo;
        
        //pedida de extremos

        System.out.println("Introduce el extremo inferior del intervalo aleatorio");
        minimo = s.nextInt();

        System.out.println("Introduce el extremo superior del intervalo aleatorio");
        maximo = s.nextInt();

        intervalo = maximo * minimo;
        
        //rellenar matriz
        boolean repetir = false;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int contador = 0;
            do {
              repetir = false;
    
              matriz [i] [j] = (int)(Math.random()*(intervalo));
    
              for (contador = 0; contador < 10 * i + j; contador++) {
                if (matriz [i][j] == matriz [contador / 10][contador % 10]) repetir = true;
              }
              
            } while (repetir);
            }
        }


        //pintar matriz
        for (int i = 0; i < 6; i++){
    
            for (int j = 0; j < 10; j++) System.out.printf("%5d", matriz [i][j]);
            System.out.println();
      
          }
        s.close();
    }
    }
}
    }}
