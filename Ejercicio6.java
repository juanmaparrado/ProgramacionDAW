import java.util.Scanner;
public class Ejercicio6 {
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la base y la altura del triangulo separado por un espacio");
    int base = s.nextInt();
    int altura = s.nextInt();
    double area= (double)(base*altura)/2;
    System.out.println("El area del triangulo es "+area);
	}
}
