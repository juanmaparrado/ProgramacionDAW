public class Ej3ArraysBi {
    public static void main(String[] args) {
        int numeros [] [] = new int [5] [6];
        //filas
        for (int i = 0; i < 4; i++) {
            numeros [i] [5] = 0;
            
            for (int j = 0; j < 5; j++) {
                numeros [i] [j] = (int)(Math.random()*900)+100;
                numeros [i] [5] += numeros [i] [j];
            }
        }
        //columnas
        for (int j = 0; j < 6; j++) {
            numeros[4][j] = 0 ;
            for (int i = 0; i < 4; i++) {
                numeros[4][j] += numeros [i] [j];
            }
        }
        //imprimir
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.printf("%8d",numeros [i] [j]);
            }
            
        }
    }
}
