import paquetes.*;

public class App {
    public static void main(String[] args) throws Exception {
        int n, n1;
        System.out.println("Indique el número de dados: ");
        n=Integer.parseInt(System.console().readLine());
        System.out.println("Indique el número de caras: ");
        n1=Integer.parseInt(System.console().readLine());
        tirada t1=new tirada(n,n1);
        System.out.println(t1);
    }
}
