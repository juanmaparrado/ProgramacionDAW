import java.util.Scanner;

public class Ej8v2ArraysBi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int filaAlfil;
        int colAlfil;
        int filaActual;
        int colActual;

        System.out.println("Introduzca la columna en letra (de forma la columna 1 es la a,la 2 es la b...)");
        colAlfil = s.next().charAt(0)-96;   

        System.out.println("Introduzca la fila del alfil");
        filaAlfil = s.nextInt();

        s.close();

        for (int i = 0; i < 8; i++) {
            filaActual = filaAlfil - i; 

            colActual = colAlfil + i;
            if (filaActual > 0 && colActual < 9) 
                System.out.printf("%2d\n", String.valueOf((char)(colActual+96)),filaActual);
            
            colActual = colAlfil - i;
            if (filaActual > 0 && colActual > 0) 
                System.out.printf("%2d\n", String.valueOf((char)(colActual+96)),filaActual);
            
            filaActual = filaAlfil + i;

            colActual = colAlfil +i ;
            if (filaActual < 9 && colActual < 9 ) 
                System.out.printf("%2d\n", String.valueOf((char)(colActual+96)),filaActual);
            
            colActual = colAlfil - i;
            if (filaActual < 9 && colActual > 0) {
                System.out.printf("%2d\n", String.valueOf((char)(colActual+96)),filaActual);
            }

        }
    }
}

