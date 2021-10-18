import java.util.Scanner;
public class Ejercicio5 {
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la base y la altura del rectangulo separado por un espacio,solo entero");
    int base = s.nextInt();
    int altura = s.nextInt();
    int area= base*altura;
    System.out.println("El area del rectangulo es "+area);
	}
}

