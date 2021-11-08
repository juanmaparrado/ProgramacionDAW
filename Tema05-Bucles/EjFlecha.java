public class EjFlecha {
    /*
Altura: 5
Anchura: 10
        *
  ********
  *********
  ********
        *
*/
    public static void main(String[] args) {
      int altura, anchuraMinima, anchura;
      int aux;
      boolean error;
  
      do {
        System.out.print("Introduzca la altura de la flecha (impar y mayor o igual a 3): ");
        altura = Integer.parseInt(System.console().readLine());
  
        error = altura % 2 == 0 || altura < 3;
        if (error) System.out.print("Valor incorrecto. ");
      } while (error);
  
      anchuraMinima = altura / 2 + 1;
  
      do {
        System.out.printf("Introduzca la anchura de la flecha (mayor o igual que %d): ", anchuraMinima);
        anchura = Integer.parseInt(System.console().readLine());
        
        error = anchura < anchuraMinima;
        if (error) System.out.print("Valor incorrecto, introduzca un número mayor. ");
      } while (error);
  
      aux = anchura + 1 - altura / 2;
  
      for (int i = 0; i < aux - 2; i++) {
        System.out.print(" ");
      }
      System.out.println("*");
  
      for (int i = 0; i < altura - 2; i++) {
        for (int j = 0; j < aux; j++) System.out.print("*");
        if ((altura - 2) / 2 > i) aux++;
        else aux--;
        System.out.println();
      }
  
      aux = anchura + 1 - altura / 2;
  
      for (int i = 0; i < aux - 2; i++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
