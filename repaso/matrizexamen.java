package repaso;



/**
 * matrizexamen
 */
public class matrizexamen {

    public static void main(String[] args) {
       
        int filas = 0,columnas = 0;
        int f, c;
        int n = 0;
        int z = 0;
        System.out.println("Indique el numero de filas");
        filas = Integer.parseInt(System.console().readLine());
        System.out.println("Indique el numero de columnas");
        columnas = Integer.parseInt(System.console().readLine());

        int [][] origen = new int[filas][columnas];
        int [][] destino = new int[filas][columnas];
        int [] uni = new int[(filas*columnas)];

        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                origen[i][j] = n;
                n++;
                //posicion fila *  columna total + columna
                uni[(i*columnas + j)] = origen[i][j];
            }
        }

        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
               System.out.printf("%4d",origen[i][j]);

            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < uni.length; i++) {
            System.out.printf("%4d",uni[i]);
        }
      

        
       


    }
}