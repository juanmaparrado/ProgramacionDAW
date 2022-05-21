

import java.util.Scanner;

public class PinaLetra {
    public static void main(String[] args) {
        int pin ;
        String resultado = "";
        int cifra ;

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el pin: ");
        pin = s.next().charAt(0);

        if (pin == 0) {
            resultado = "cero";
        }else{
            while (pin>0) {

                //sacar ultima cifra

                cifra = (int)pin%10 ;
                pin /= 10 ;
                String cifraLetra ="";
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
                    case 3:
                        cifraLetra = "tres";
                        break;
                    case 4:
                        cifraLetra = "cuatro";
                        break;
                    case 5:
                        cifraLetra = "cinco";
                        break;
                    case 6:
                        cifraLetra = "seis";
                        break;
                    case 7:
                        cifraLetra = "siete";
                        break;
                    case 8:
                        cifraLetra = "ocho";
                        break;
                    case 9:
                        cifraLetra = "nueve";
                        break;
                    default:
                        break;
                }
                resultado = cifraLetra + " "+resultado ;
            }
        }
        System.out.println(resultado);
        s.close();
    
    }
}
