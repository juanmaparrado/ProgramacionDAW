public class Ej15 {
	
	public static void main (String[] args) {
    System.out.println("Introduce el caracter con el que quieres rellenar la piramide");
    String c = System.console().readLine();
    System.out.println("Introduce el numero de modelo que desea");
    System.out.println("1. Piramide con vertice arriba");
    System.out.println("2. Piramide invertida");
    System.out.println("3. Piramide con vertice a la izquierda");
    System.out.println("4. Piramide con vertice a la derecha");
    int modelo = Integer.parseInt(System.console().readLine());
    
    switch (modelo){
      case 1:
        System.out.println("  "+c);
        System.out.println(" "+c+c+c);
        System.out.println(""+c+c+c+c+c);
        break;
      case 2:
        System.out.println(""+c+c+c+c+c);
        System.out.println(" "+c+c+c);
        System.out.println("  "+c);
        break;
      case 3:
        System.out.println("  "+c);
        System.out.println(" "+c+c);
        System.out.println(""+c+c+c);
        System.out.println(" "+c+c);
        System.out.println("  "+c);
        break;
      case 4:
        System.out.println("");
        System.out.println(c);
        System.out.println(c+c);
        System.out.println(c+c+c);
        System.out.println(c+c);
        System.out.println(c);
        break;
        default:
        System.out.println("No ha elegido un modelo correcto");
        break;
      }
    	}
}

