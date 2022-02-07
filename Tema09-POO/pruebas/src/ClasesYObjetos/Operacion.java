package ClasesYObjetos;

public class Operacion {
    //Atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos

    //pedir al usuario dos numeros
    public void leerNumeros (){
        System.out.println("Introduce un numero");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce otro numero");
        num2 = Integer.parseInt(System.console().readLine());
    }
    public void sumar (){
        suma = num1 + num2 ;
    }
    public void restar (){
        resta = num1 - num2 ;
    }
    public void multiplicar (){
        multiplicacion = num1 * num2 ;
    }
    public void dividir (){
        division = num1 / num2;
    }

    public void mostrarResultado() {
        System.out.println("El numero 1 es : "+num1);
        System.out.println("El numero 2 es : "+num2);
        System.out.println("La suma de los numeros es : "+suma);
        System.out.println("La resta de los numeros es : "+resta);
        System.out.println("La multiplicacion de los numeros es : "+multiplicacion);
        System.out.println("La division de los numeros es : "+division);


    }


}   
