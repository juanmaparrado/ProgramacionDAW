public class Ej5ArraysUni {
    public static void main(String[] args) {
        int numero[]= new int[10];
        System.out.println("Introduce la lista de 10 numeros");
        for (int i = 0; i < 10; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
        }
    }
}
