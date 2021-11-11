/**
 *
*  Modifica el programa anterior para que la probabilidad de que salga un "1" sea de 1/2,
* la probabilidad de que salga "x" sea de 1/3 y la probabilidad de que salga "2" sea de 1/6
* Nótese que 1/2 = 3/6 y 1/3 = 2/6.
 */
public class Ejercicio8probabilidad {
    public static void main(String[] args) {

         int resultado;
         for (int i = 0; i < 15; i++) {
            System.out.print(i+".");
            for (int j = 0; j < 3; j++) {
            resultado = (int)(((Math.random())*6)+1) ;
                switch (resultado) {
                 case 1,2,3:
                 System.out.print("1     |");
                    break;
                 case 4,5:
                 System.out.print("  X   |");
                    break;
                 case 6:
                 System.out.print("    2 |");
                default:
                    break;
                 }
             }
        System.out.println();
        }
    }
}