public class Ejercicio7quiniela {
    public static void main(String[] args) {
        int resultado;
        int columnas = 3;
        for (int i = 1; i <= 15; i++) {

            System.out.printf("%4d. |",i);

            if (i == 15) {
                columnas=1;
            }
        
            for (int j = 1; j <= columnas; j++) {

            resultado = (int)((Math.random())*3)+1;

                switch (resultado) {
                    case 1:
                        System.out.print("1   |");
                        break;
                    case 2:
                        System.out.print("   2|");
                        break;
                    case 3:
                        System.out.print("  X |");
                        break;
                    default:
                        
                }
           }
           
            System.out.println();
        }
    }
}
