/*
    Juan Manuel Parrado 1ºDAW
    SIEMPRE SE DIBUJAN ENTEROS 
    EL NUMERO DE ALTO Y DE ANCHO SON CONTADOS EN HEXAGONOS Y NO EN CARACTERES
    ASI ES COMO HE PODIDO HACERLO
    
*/
import java.util.Scanner;

public class Ex19jmpe2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.print("Introduce la altura: ");
        int alto = s.nextInt();
        System.out.println("Introduce el ancho: ");
        int ancho = s.nextInt();
        s.close();
    


        
            for (int j = 0; j < alto; j++) {

                   //tramo arriba --    --
                        for (int i = 0; i < ancho; i++) {
                            System.out.print("--");
                             for (int l = 0; l < 4; l++) {
                            System.out.print(" ");
                        }
                        
                        }
                        System.out.println();
                         
                       // tramo barras **\**
                       for (int i = 0; i < ancho; i++) {
                           for (int l = 0; l < 1; l++) {
                               System.out.print("  ");
                               System.out.print("\\");
                           }
                           for (int l = 0; l < 1; l++) {
                            System.out.print("  ");
                            System.out.print("/");
                           }

                       }
                       System.out.println();
                            // tramo medio hexagono
                        
                            for (int j3 = 0; j3 < ancho; j3++) {
                                for (int i = 0; i < 3; i++) {
                                    System.out.print(" ");
                                }
                                
                                for (int l = 0; l < 2; l++) {
                                    System.out.print("-");
                                }
                                System.out.print(" ");
                            }
                            
                         System.out.println();

                        //tramo barras **
                        for (int i = 0; i < ancho; i++) {
                            for (int l = 0; l < 1; l++) {
                                System.out.print("  ");
                                System.out.print("/");
                            }
                            for (int l = 0; l < 1; l++) {
                             System.out.print("  ");
                             System.out.print("\\");
                            }
                         }
                         System.out.println();
                          // tramo final

                        for (int i = 0; i < ancho; i++) {
                        System.out.print("--");
                        for (int l = 0; l < 4; l++) {
                            System.out.print(" ");
                        }
                        }
                    System.out.println();

            }
            
    }
}
