package ClasesYObjetos;

public class Operacion2 {
    //Metodos
    public int sumar (int num1, int num2){
      int suma = num1 + num2; 
      return suma;
    }
    public int restar (int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
    public int multiplicar (int num1, int num2){
        int multiplicacion = num1 * num2;
        return multiplicacion;

    }
    public float dividir (int num1, int num2){
        float division = num1 / num2;
        return division;
    }

    public void mostrarResultado(int suma,int resta,float division,int multiplicacion) {
        System.out.println("La suma de los numeros es : "+suma);
        System.out.println("La resta de los numeros es : "+resta);
        System.out.println("La multiplicacion de los numeros es : "+multiplicacion);
        System.out.println("La division de los numeros es : "+division);


    }


}   


