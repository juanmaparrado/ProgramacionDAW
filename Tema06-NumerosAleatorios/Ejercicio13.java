public class Ejercicio13 {
    public static void main(String[] args) {
        int dado1 = 1;
        int dado2 = 0;
        do {
            dado1 = (int)((Math.random())*7);
            dado2 = (int)((Math.random())*7);
            System.out.println(dado1+" "+dado2);
        } while (dado1 != dado2);


    }
}
