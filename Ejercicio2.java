public class Ejercicio2{
	public static void main (String[] args) {
    
    String dinero;
    System.out.println("Introuzca el importe en euros que quiere convertir" );
		dinero = System.console().readLine() ;
    int euros = Integer.parseInt(dinero);
    double pesetas = 166.386;
    double conversor = euros*pesetas;
    System.out.println("El importe en euros es "+euros);
    System.out.println("El importe en pesetas es "+conversor);
	}
}

