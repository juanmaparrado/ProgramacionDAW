/**
 * Ejercicio3CartaEspañola
 */
public class Ejercicio3CartaEspañola {
public static void main(String[] args) {
   
    String palo="" ;
    String carta="";
    int numeroPalo = (int)(((Math.random())*4)+1);
    int numeroCarta = (int)((Math.random()*12)+1);
   
    switch (numeroPalo) {
        case 1:
            palo = "oro";
            break;
        case 2 :
            palo = "copas";
            break;
        case 3 :
            palo = "bastos";
            break;
        case 4 :
            palo = "espadas";
            break;
        default:
        break;
    }

    switch (numeroCarta) {
        case 1:
            carta = "As";
            break;
        case 10:
            carta="sota";
            break;
        case 11:
            carta="caballo";
            break;
        case 12:
            carta="rey";
            break;
        default:
            carta = String.valueOf(numeroCarta);
            break;
    }
    System.out.println("La carta generada es: "+carta+" de "+palo);
    
}
}