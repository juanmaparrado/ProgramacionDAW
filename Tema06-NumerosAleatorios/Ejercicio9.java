public class Ejercicio9 {
    /*
* Realiza un programa que vaya generando números aleatorios pares
* entre 0 y 100 y que no termine hasta que no saque el número 24. El
* programa deberá decir al final cuántos números se han generado. 
    */
    public static void main(String[] args) {
       int cantidad =0;
       int n = 0;
       do {
           n = (int)((Math.random())*101);
            if (n % 2 ==0) {
                 System.out.print(n+" ");
                 cantidad++;
            }
       } while (n != 24);
     System.out.println("Se han generado "+cantidad+" numeros.");
    }
}
