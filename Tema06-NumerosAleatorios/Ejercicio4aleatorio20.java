public class Ejercicio4aleatorio20 {
    public static void main(String[] args) {
        int cantidad = 20;
        for (int i = 0; i < cantidad; i++) {

            int numero = (int)((Math.random()*10)+1);
            System.out.print(numero+" ");
        }
        System.out.println();
    }
}
