public class EjFlechaArriba {
    /*
Anchura: 5
Altura: 10 
  *
 ***
*****
 ***
 ***
 ***
 ***
 ***
 ***
 ***
*/
  public static void main(String[] args) {
    int anchura, alturaMinima, altura;
    boolean error;

    do {
      System.out.print("Introduzca la anchura de la flecha (impar): ");
      anchura = Integer.parseInt(System.console().readLine());

      error = anchura % 2 == 0;
      if (error) System.out.print("Valor incorrecto. ");
    } while (error);

    alturaMinima = anchura / 2 + 1;

    do {
      System.out.printf("Introduzca la altura de la flecha (mayor o igual que %d): ", alturaMinima);
      altura = Integer.parseInt(System.console().readLine());
      
      error = altura < alturaMinima;
      if (error) System.out.print("Valor incorrecto, introduzca un número mayor. ");
    } while (error);

    for (int i = 1; i <= alturaMinima; i++) {
      for (int j = 0; j < anchura / 2 + i; j++) {
        if (j >= anchura / 2 + 1 - i && j <= anchura / 2 + i) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }

    for (int i = 0; i < altura - alturaMinima; i++) {
      for (int j = 0; j < anchura; j++) {
        System.out.print(j >= 1 && j < anchura - 1 ? "*" : " ");
      }
      System.out.println();
    }
  }
}

