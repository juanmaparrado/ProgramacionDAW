public class EjMarcoRombo {
  public static void main(String[] args) {
    int altura;
    boolean error;

    do {
      System.out.print("Introduzca la altura del rombo (impar y mayor a 2): ");
      altura = Integer.parseInt(System.console().readLine()) + 1;
      
      error = altura % 2 != 0 || altura < 3;
      if (error) System.out.print("Valor incorrecto. ");
    } while (error);

    for (int i = 0; i < altura / 2; i++) {
      for (int j = 0; j <= altura; j++) {
        if (j >= altura / 2 - i && j <= altura / 2 + i) System.out.print(" ");
        else System.out.print("*");
      }
      System.out.println();
    }

    for (int i = altura / 2; i > 1; i--) {
      for (int j = 1; j <= altura + 1; j++) {
        if (j - 4 >= altura / 2 - 1 - i && j <= altura / 2 - 1 + i) System.out.print(" ");
        else System.out.print("*");
      }
      System.out.println();
    }
  }
}