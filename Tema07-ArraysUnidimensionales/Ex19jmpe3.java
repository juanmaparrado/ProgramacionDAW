/*JUAN MANUEL PARRADO ESCRIBANO */


import java.util.Scanner;

public class Ex19jmpe3 {
    public static void main(String[] args) {

        int numero [] = new int [4];
        numero [1] = 12345 ;
        numero [2] = 78916;
        numero [3] = 45789;
        numero [4] = 6347;
        
        int numAcertar = 0; //numero a acertar
        int numUsuario = 0; //numero introducido
        int numDes = 0 ; //numero desordenado
        final int intentos = 0;
        boolean acertado = false ;
        numAcertar = numero[(int)((Math.random()*4)+1)];
        Scanner s = new Scanner(System.in);

       
        do {
            for (int i = 5; i > intentos; i--) {
                System.out.print("Tiene"+(i)+"intentos. ");
                System.out.print("Introduce el numero con los digitos"+numDes);


                 if (numUsuario == numAcertar) {
                    System.out.println("Felicidades,ha acertado el numero ");
                    acertado = true;
                        }
                 if (i == 1) {
                    System.out.println("el numero a acertar era "+numAcertar);
                        }
   
                }
            }
         while (acertado); 
        
           s.close();
        }
}
        

    

