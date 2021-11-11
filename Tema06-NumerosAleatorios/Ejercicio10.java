public class Ejercicio10 {
    public static void main(String[] args) {
    /*
* 10. Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
* El carácter con el que se pinta cada línea se elige de forma aleatoria entre
* uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
* aleatoria entre 1 y 40 caracteres. 
    */
    int caracter ;
    for (int i = 0; i < 10; i++) {
        caracter = (int)((Math.random())*6)+1;
        String c = "" ;
            switch (caracter) {
                case 1:
                    c = "*";
                    break;
                case 2:
                    c = "-";
                    break;
                case 3:
                    c = "=";
                    break;
                case 4:
                    c = ".";
                    break;
                case 5:
                    c = "|";
                    break;
                case 6:
                    c ="@";
                    break;
                default:
                    break;
            }
        for (int j = 0; j < 10; j++) {
            System.out.print(c);
        }
        System.out.println();
        
    }
    }
}
