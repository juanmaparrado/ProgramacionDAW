
/*Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.*/
public class Ej14 {
    public static void main(String[] args) {
    System.out.println("introduce la base de la potencia");
    int base=Integer.parseInt(System.console().readLine());
    System.out.println("introduce el exponente de la potencia");
    int exponente=Integer.parseInt(System.console().readLine());
    int aux=1;    
    for (int i = 0; i < exponente; i++) {
        aux *= base ;
    }
   System.out.print(aux);
    }
}
