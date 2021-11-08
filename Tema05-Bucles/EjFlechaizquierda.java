/*
Altura: 5
Anchura: 10
    *
   *********
  **********
   *********
    *
*/
public class EjFlechaizquierda {
  public static void main(String[] args) {
    int altura, anchuraMinima, anchura;
    int aux = 0;
    boolean error;

    do {
      System.out.print("Introduzca la altura de la flecha (impar): ");
      altura = Integer.parseInt(System.console().readLine());

      error = altura % 2 == 0;
      if (error) System.out.print("Valor incorrecto. ");
    } while (error);

    anchuraMinima = altura / 2 + 1;

    do {
      System.out.printf("Introduzca la anchura de la flecha (mayor o igual que %d): ", anchuraMinima);
      anchura = Integer.parseInt(System.console().readLine());
      
      error = anchura < anchuraMinima;
      if (error) System.out.print("Valor incorrecto, introduzca un número mayor. ");
    } while (error);

    for (int i = 0; i < altura; i++) {
      if (i > altura / 2) aux++;

      for (int j = 0; j < anchura; j++) {
        if (j - aux * 2 >= altura / 2 - i && i != 0 && i != altura - 1
          || j == altura / 2 && (i == 0 || i == altura - 1)
        ) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}