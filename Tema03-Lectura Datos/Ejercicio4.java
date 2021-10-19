public class Ejercicio4 {
	
	public static void main (String[] args) {
		String operandos;
    System.out.println("Introduce el primer numero");
    operandos = System.console().readLine();
    int n1= Integer.parseInt(operandos);
    
    System.out.println("Introduce el segundo numero");
    operandos = System.console().readLine();
    int n2= Integer.parseInt(operandos);
    
    int suma=(n1+n2);
    int resta = (n1-n2);
    int multi = (n1*n2);
    int division= (n1/n2);
    System.out.println("El resultado de la suma es "+suma);
    System.out.println("El resultado de la resta es "+resta);
    System.out.println("El resultado de la multiplicacion es "+multi);
    System.out.println("El resultado de la division es "+division);
    
	}
}

