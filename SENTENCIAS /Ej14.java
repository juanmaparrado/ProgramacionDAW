public class Ej14 {
	
	public static void main (String[] args) {
		int a ;
    System.out.println("Introduce el numero para saber si es par o impar y si es divisible entre 5");
    a = Integer.parseInt(System.console().readLine());
    if ((a%2) == 0){
      System.out.println("El numero introducido es par");
      }
      else{
        System.out.println("El numero introducido es impar");
        }
    if ((a%5) == 0){
      System.out.println("El numero introducido es divisible entre 5");
      }
      else{
          System.out.println("El numero introducido es indivisible entre 5");
      }
	}
}

