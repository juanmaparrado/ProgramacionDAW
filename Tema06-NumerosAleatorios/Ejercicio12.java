public class Ejercicio12 {
    public static void main(String[] args) {
        /*12. Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el
* código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un
* entero en un carácter. */
    char caracter;
    for (int i = 0; i < 5000; i++) {
        caracter = (char)((Math.random())*(126-32+1)+32);
        System.out.print(caracter);
    }
    }
}