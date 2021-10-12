public class Ejercicio8 {
	
	public static void main (String[] args) {
    int precio = 12;
    System.out.println("¿Cuantas horas ha trabajado en toda la semana?");
    int hsemanales= Integer.parseInt(System.console().readLine());
    int sueldo = precio * hsemanales;
    System.out.println("El salario correspondiente es "+sueldo);
      
	}
}

