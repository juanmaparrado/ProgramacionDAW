import java.util.Scanner;
public class Ej07 {
public static void main(String[] args) {
 int NumSecreto=1234 ;
 int contador = 0;
 int NumIntroducido=0;
 boolean    Acierto = false ; 
        Scanner s = new Scanner(System.in);
        while (contador<4 && Acierto == false) {
           System.out.println("Introduce el numero de la combinacion");
        NumIntroducido = s.nextInt();
        if (NumIntroducido == NumSecreto) {
             Acierto = true;   
        }  
        else{
                System.out.println("Esa no es la combinacion");
        }
        contador++;    
        }
        if (Acierto == true) {
                System.out.println("FELICIDADES ABRISTE LA CAJA FUERTE");     
        }
        s.close();
}
}
