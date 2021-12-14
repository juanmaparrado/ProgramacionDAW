
    /* Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados. */
public class ejmatrizrotada {
    public static void main(String[] args) {
      int[][] matriz = new int[12][12];
  
      for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
          int num = (int) (Math.random() * 101);
          matriz[i][j] = num;
          System.out.printf("%4d", num);
        }
        System.out.println();
      }
  
      int[][] nuevaMatriz = new int[12][12];
  
      for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
          if (j < i && j <= 11 - i) nuevaMatriz[i - 1][j] = matriz[i][j];
          else if (j >= 11 - i && j > i) nuevaMatriz[i + 1][j] = matriz[i][j];
          else if (j >= i && i < 6) nuevaMatriz[i][j + 1] = matriz[i][j];
          else nuevaMatriz[i][j - 1] = matriz[i][j];
        }
      }
  
      System.out.print("\n\n");
  
      for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
          System.out.printf("%4d", nuevaMatriz[i][j]);
        }
        System.out.println();
      }
    }  
  }
}
