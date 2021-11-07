import java.util.Scanner;
public class Ej26 {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);  
     System.out.println("Introduce un numero que el programa dara la vuelta");
     int numIntroducido = s.nextInt();
     int alreves = 0;
     s.close(); 
    while (numIntroducido > 0) {
       alreves = ( alreves * 10 ) + ( numIntroducido % 10);
        numIntroducido = numIntroducido/10;
    }
      System.out.println(alreves);  
    }
}

