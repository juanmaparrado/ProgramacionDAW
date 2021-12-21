/*Juan Manuel Parrado Escribano */

import java.util.Scanner;
public class Ex19jmpe1 {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        int filas ;
        int columnas ;
        int minimo;
        int maximo;

//pedida de datos fila y columna

        do {

             System.out.println("Intoduce el nº de filas [1-20]");
                filas = s.nextInt();

        } while (filas < 1 || filas > 20);

        do {

            System.out.println("Intoduce el nº de columnas [1-20]");
            columnas = s.nextInt();

        } while (columnas<1 || columnas > 20);

        int casillas = filas * columnas;

//pedida de extremos
        do {

            System.out.println("Introduce el extremo inferior del intervalo aleatorio");
        minimo = s.nextInt();

        System.out.println("Introduce el extremo superior del intervalo aleatorio");
        maximo = s.nextInt();
            

        } while ((maximo-minimo)< casillas - 1 );
        
           
        int matriz [] [] = new int [filas] [columnas];

//rellenar matriz
        boolean repetir = false;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                int contador = 0;

            do {

              repetir = false;
              matriz [i] [j] = (int)(Math.random()*(maximo-minimo+1))+minimo;

              for (contador = 0; contador < i * j + j; contador++) {
                  //donde i es fila y j columna
                if (matriz [i][j] == matriz [contador / columnas][contador % columnas]) 
                repetir = true;
              }
              
            } while (repetir);
            }
        }
//pintar matriz
        for (int i = 0; i < filas; i++){
    
            for (int j = 0; j < columnas; j++) 
            System.out.printf("%5d", matriz [i][j]);
            System.out.println();
      
          }
        s.close();
    }
}

