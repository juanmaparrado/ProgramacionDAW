package Repaso2;

import java.util.Scanner;

public class PinaTexto {
    public static void main(String[] args) {
        
        int pin = 0;
        String resultado = " " ;
        int cifra = 0;


        Scanner s = new Scanner(System.in);
        System.out.println("introduzca el PIN : ");
        pin = s.nextInt();
       
       
       if (pin == 0) {
           resultado = "cero";
       }
       else {
        while (pin > 0) {
         
            cifra = (pin%10);
            pin /= 10; 
            String cifraLetra = "";
            switch (cifra) {
                case 0:
                    cifraLetra = "cero";
                    break;
                case 1:
                cifraLetra = "uno";
                    break;
                case 2 :
                cifraLetra = "dos";
                    break;
                case 3 :
                cifraLetra = "tres";
                    break;
                case 4 :
                cifraLetra = "cuatro";
                    break;
                case 5 :
                cifraLetra = "cinco" ;
                    break;
                case 6 :
                cifraLetra = "seis";
                    break;
                case 7 :
                cifraLetra = "siete";
                    break;
                case 8 :
                cifraLetra = "ocho";
                        break;  
                case 9 :
                cifraLetra = "nueve";
                    break;
             
                default:
                    break;
            }
            resultado = cifraLetra+" "+resultado;
           
        }

        System.out.println(""+resultado);
        s.close();

        }

    }
}
