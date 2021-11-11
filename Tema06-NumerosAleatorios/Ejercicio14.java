import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
      /*
      Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.
      */  
        Scanner s = new Scanner(System.in);
      int intentos = 5;
      int n;
      int max = 100;
      int min =0;
      int comparacion;

      System.out.println("Voy a intentar adivinar el numero que introduzcas");
      System.out.println("Introduce el numero entero entre 0 a 100");
      n = s.nextInt();
     

      do {

            n = (int)(((Math.random())*(max-min)+min));
            System.out.println("Estaba pensando en el "+n);
            System.out.println("Dime si tu numero es 1) mayor, 2)menor o 3)igual(INTRODUCE EL NUMERO)");
            
            comparacion = s.nextInt();
            intentos--; 
            if (intentos>0) {
            switch (comparacion) {
                case 1:
                //mayor
                    min  = n+1;
                    System.out.print("No he acertado");
                    break;
                case 2:
                //menor
                    max = n-1;
                    System.out.print("No he acertado");
                break;
                case 3:
                //igual
                    System.out.println("He conseguido adivinar tu numero");
                    break;
                default:
                    break;
            } 
        } 
      } while ((intentos >0) && (comparacion!=3));
      if (comparacion!=3) {
          System.out.println("No he conseguido acertarlo en los intentos que tengo");
      }
      s.close();
    }
}
