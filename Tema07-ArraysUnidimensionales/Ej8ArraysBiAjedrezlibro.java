import java.util.Scanner;

public class Ej8ArraysBiAjedrezlibro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int filaAlfil;
        int colAlfil ;

        //entrada de datos del usuario
        
        System.out.println("Introduzca la columna en letra (de forma la columna 1 es la a,la 2 es la b...)");
        colAlfil = s.next().charAt(0)-96;   //asi hacemos que 1 sea a,2 sea b ...

        System.out.println("Introduzca la fila del alfil");
        filaAlfil = s.nextInt();
        

        s.close();
        //comprobar posiciones
        for (int filaActual = 0; filaActual < 9; filaActual++) {
            
            for (int colActual = 0; colActual < 9; colActual++) {
               if ((Math.abs(filaActual - filaAlfil)) == (Math.abs(colActual-colAlfil)) && filaActual!= filaAlfil) {
                   System.out.printf("C: %s F: %d \n",String.valueOf((char)(colActual+96)),filaActual);
               } 
            }
        }
    
    }
}
