public class Ejercicio12{
	
	public static void main (String[] args) {
    float p1= 0.4f;
    float p2= 0.6f;
    System.out.println("Introduce la primera nota");
      float nota1= Float.parseFloat(System.console().readLine());
    System.out.println("Introduce la nota media que desea obtener");
      float notamedia= Float.parseFloat(System.console().readLine());
    float nota2= (notamedia-(nota1 *p1))/p2;
    System.out.println("La nota que se necesita es "+nota2);
	}
}

