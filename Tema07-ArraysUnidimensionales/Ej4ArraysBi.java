public class Ej4ArraysBi {
    public static void main(String[] args) throws InterruptedException {
        int numeros [] [] = new int [5] [6];
        //filas
        for (int i = 0; i < 4; i++) {
            numeros [i] [5] = 0;
            
            for (int j = 0; j < 5; j++) {
                numeros [i] [j] = (int)(Math.random()*900)+100;
                numeros [i] [5] += numeros [i] [j];
            }
        }
        for (int j = 0; j < 6; j++) {
            numeros[4][j] = 0 ;
            for (int i = 0; i < 4; i++) {
                numeros[4][j] += numeros [i] [j];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                if (i==4 || j ==5) 
                    Thread.sleep(100);
                    System.out.printf("%8d",numeros [i] [j]);
                }
                
            }
            
        }
    }


