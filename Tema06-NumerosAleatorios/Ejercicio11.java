public class Ejercicio11 {
    public static void main(String[] args) {
        /* 11. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.
*/
        int nota ;
        String resultado = "";
        for (int i = 0; i < 20; i++) {
            nota = (int)((Math.random())*11);
            switch (nota) {
                case 0,1,2,3,4:
                    resultado = "suspenso";
                    break;
                case 5:
                    resultado = "suficiente";
                case 6:
                    resultado = "bien";
                    break;
                case 7,8:
                    resultado = "notable";
                    break;
                case 9,10:
                    resultado = "sobresaliente";
                    break;
                default:
            }
            System.out.println(nota+"-->"+resultado);
        }
    }
}
