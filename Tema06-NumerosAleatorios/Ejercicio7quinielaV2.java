public class Ejercicio7quinielaV2 {
    public static void main(String[] args) {
        int resultado;
        for (int i = 0; i < 15; i++) {
            System.out.print(i+". ");
            for (int j = 0; j < 3; j++) {
                resultado = (int)(((Math.random())*3)+1) ;
                switch (resultado) {
                    case 1:
                        System.out.print("1     |");
                        break;
                    case 3:
                        System.out.print("  X   |");
                        break;
                    case 2:
                        System.out.print("    2 |");
                    default:
                        break;
                }
                
            }
            System.out.println();
        }
    }
}
