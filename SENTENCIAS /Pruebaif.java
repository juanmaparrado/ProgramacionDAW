public class Pruebaif{
	
	public static void main (String[] args) {
    int n ;
    int resto;
		System.out.println("Introduce el numero entero");
    n = Integer.parseInt(System.console().readLine());
    
    resto = n % 2;
    if (resto == 0){
      System.out.println("El numero introducido es par");
      }else {
        System.out.println("El numero introducido es impar");
        }
	}
}

