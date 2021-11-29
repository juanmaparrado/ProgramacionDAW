public class Ej13 {
	
	public static void main (String[] args) {
    int a;
    int b;
    int c;
    int aux1;
    
    System.out.println("El programa solo acepta numeros de tipo entero");
    System.out.println("Introduce el primer numero");
      a = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el segundo numero");
      b = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el tercer numero");
      c = Integer.parseInt(System.console().readLine());
    
    if (a > b){}
      else{ 
        aux1 = a;
        a = b;
        b = aux1;
        }
    if (a > c){}
    else{
      aux1 = a;
      a = c;
      c = aux1;
      }
    if (b > c){}
      else {
        aux1 = b ;
        b = c;
        c = aux1;
        }
    System.out.println("Los numeros ordenados de mayor a menor son: "+a+" > "+b+" > "+c);
  }
}

