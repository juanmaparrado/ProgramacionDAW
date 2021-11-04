public class Eje12 {
public static void main(String[] args) {
            int nEntrada;
            int nA = 0;
            int nB = 1;
            int aux = 0 ;
            System.out.println("Este programa muestra los n primeros numeros de la serie de fibonnacci");
            nEntrada = Integer.parseInt(System.console().readLine());
            if (nEntrada == 0) {
                nA = -1;
            }
            for (;nEntrada >= 0; nEntrada--) {
                aux = nA;
                nA = nB;
                nB = aux + nB;
            
                System.out.println(" "+nB);
            }
        }
        
    }

