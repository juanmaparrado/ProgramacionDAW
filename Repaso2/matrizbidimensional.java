package Repaso2;

import java.util.Scanner;

public class matrizbidimensional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int matriz[][];
        int filas;
        int columnas;
        int inferior;
        int superior;

        do {
            System.out.println("introduce el numero de filas [1-20] : ");
            filas = s.nextInt(); 

        } while (!(filas >=1 && filas <= 20));

        do {
            System.out.println("introduce el numero de columnas [1-20] : ");
            columnas = s.nextInt();
        } while (!(columnas >=1 && columnas <= 20));


        matriz = new int[filas][columnas];

        do {
            System.out.println("introduce el extremo inferior del intervalo aleatorio: ");
            inferior = s.nextInt();

            System.out.println("introduce el extremo superior del intervalo aleatorio: ");
            superior = s.nextInt();
            if ((superior-inferior+1)<(filas*columnas)) {
                System.out.println("Cantidad insuficiente de datos");
            }
            
        } while ((superior-inferior+1)<(filas*columnas));


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                boolean repetido;
                do {
                    matriz[i][j] = (int)(Math.random()*(superior-inferior+1)+inferior);
                    repetido = false ;
                    for (int k = 0; k < i && !repetido; k++) {
                        for (int k2 = 0; k2 < columnas && !repetido; k2++) {
                            if (matriz[i][j] == matriz[k][k2]) {
                                repetido = true ;
                            }
                        }
                        
                    }

                    if (!repetido) {
                        for (int k = 0; k < j && !repetido; k++) {
                            if (matriz[i][j] == matriz[i][k]) {
                                repetido = true ;
                            } 
                        }
                        
                    }

                } while (repetido);


                


            }
            
        }


        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                System.out.print("|"+matriz[i][j]);
            }
            System.out.println();
        }

        
s.close();

    }
}
