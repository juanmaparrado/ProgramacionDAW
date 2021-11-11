public class Ejercicio5hasta200 {
    public static void main(String[] args) {
        int cantidad = 50;
        int suma=0;
        int minimo = 199;
        int maximo = 100;
        for (int i = 0; i < cantidad; i++) {

            int numero = (int)((Math.random()*100)+100);
            System.out.print(numero+" ");
            suma += numero;

            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("\nMinimo"+minimo+"\nMaximo"+maximo+"\nMedia"+(suma/50));
    }
}
