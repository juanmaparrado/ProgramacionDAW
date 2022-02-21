import java.util.Scanner;

public class matrizbidimensional {
    public static void main(String[] args) {
        int[][] matriz ;
        int filas,columnas,inferior,superior ;

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Introduzca el nº de filas [1-20]: ");
            filas = s.nextInt() ;
           
        } while (!(filas>=1 && filas<=20) );
         
        do {
            System.out.println("Introduzca el nº de columnas [1-20]: ");
            columnas = s.nextInt();
    
        } while (!(columnas>=1 && columnas<=20) );

        matriz = new int[filas][columnas];

        do {
            System.out.println("Introduzca el extremo inferior del intervalo aleatorio: ");
            inferior = s.nextInt();
            System.out.println("Introduzca el extremo superior del intervalo aleatorio: ");
            superior = s.nextInt();
            if ((superior-inferior+1) < (filas*columnas)) {
                System.out.println("Cantidad de datos insuficientes");
            }

        } while ((superior-inferior+1) < (filas*columnas));
        s.close();


        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random()*(superior-inferior+1))+inferior ;
                
            }
        }
        

        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                System.out.print("|"+matriz[i][j]);
            }
            System.out.println();
        }
        
    }

}
