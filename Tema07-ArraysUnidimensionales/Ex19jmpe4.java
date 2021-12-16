/*JUAN MANUEL PARRADO ESCRIBANO */
import java.util.Scanner;

public class Ex19jmpe4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ancho ;
        int alto ;
        char c = '*';
        final int h = 4;
        int numespacios = 3;
        char triangulo [] [] = new char [4][4];
         
        
        //entrada de datos
        System.out.println("Indique el ancho en triángulos: ");
        ancho = s.nextInt();
        System.out.println("Indique el alto en triángulos: ");
        alto = s.nextInt();
        s.close();  
        //alto se corresponde con filas y ancho con columnas

        char rectangulo [] [] = new char [alto][ancho];
        
        //pintar piramide
        
        for (int i = 0; i < 4; i++) {
            triangulo [i] [4] = '*';
        }
        for (int j = 0; j < 4; j++) {
          triangulo [4][j] = '*';
        }
       


        //rellenar array
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++){
            rectangulo [i] [j] = triangulo [i] [j];
            }
        }




            //mostrar array
          for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++)
            System.out.printf("%3d ", rectangulo[i][j]);
            System.out.println();
          }
      
         
    }
}
