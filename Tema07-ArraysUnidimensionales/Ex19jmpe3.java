/*JUAN MANUEL PARRADO ESCRIBANO */
import java.util.Scanner;

public class Ex19jmpe3 {
    public static void main(String[] args) {

        int numero [] = new int [4];

        numero [0] = 45783 ;
        numero [1] = 12345 ;
        numero [2] = 78916;
        numero [3] = 45789;
        
        
        int numAcertar ; 
        numAcertar = numero[(int)((Math.random()*4))];
        
        int intentos = 5;

        int aux ;
        int posicion; 
        String numDes = "";
        String acertado = "";
        String numUsuario ;

        Scanner s = new Scanner(System.in);


        
        //decapo el numero hasta que no me quedan cifras
        while (numAcertar > 0) {
            aux = numAcertar % 10;
            numAcertar /= 10;
            acertado += aux ;
            //genero si el numero se añade delante o detras
            posicion = (int)(Math.random()*2);
            
            if (posicion == 1) {
                numDes += aux ;
            }else{
                numDes = aux + numDes ;
            }

        }
        //comparacion
        do {
                System.out.print("Tiene "+(intentos)+" intentos. ");
                System.out.print(" Introduce el numero con los digitos "+numDes);
                System.out.println();
                numUsuario = s.nextLine();
                
                    if (numDes.equals(acertado)) {
                        System.out.println(" Felicidades,ha acertado el numero ");
                    }
                intentos--;
            }
         while ((intentos > 0) && ((!numUsuario.equals(acertado)))  ); 
        
         //mensaje error
         if ((!numUsuario.equals(acertado))) {
             System.out.print("No conseguiste encontrar el numero. El numero era "+acertado );
         }
        
           s.close();
        }
}
        

    

