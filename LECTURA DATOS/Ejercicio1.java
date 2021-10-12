public class Ejercicio1 {
	
	public static void main (String[] args) {
    
  String multiplicacion;
    System.out.println("Introduce un numero");
    multiplicacion = System.console().readLine();
    int numero1= Integer.parseInt(multiplicacion);
    
    System.out.println("Introduce el segundo numero");
    multiplicacion = System.console().readLine();
    int numero2= Integer.parseInt(multiplicacion);
    
    int total = (numero1*numero2);
    System.out.println("El resultado de la multiplicacion es "+total);
	}
}

