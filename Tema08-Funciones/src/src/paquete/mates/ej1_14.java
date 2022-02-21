

public class ej1_14 {

    public static int digitos(int num){
        int longitud = 1 ; 
        do {
            num /= 10 ;
            longitud++ ;
        } while ( num>= 10);

        return longitud;
    }

    public static int potencia (int base,int exponente) {
        int resultado;
        resultado = (int) Math.pow(base, exponente);
        return resultado;
    }

    public static boolean esPrimo(int num) {

        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int SiguientePrimo(int num) {
        do {
            num++ ;
            esPrimo(num);
        } while (!esPrimo(num));
        return num;
    }
    public static int voltea(int num) {
        int numVolteado = 0;
        do {
            numVolteado = (numVolteado * 10) + (num % 10);
            num /= 10;
        } while (num > 0);
        return numVolteado;
    }
    public static boolean esCapicua(int num) {
        int aux;
        aux = voltea(num);
        
        return aux == num;
    }
    public int digitoN(int num, int posicion){
        
        num = voltea(num);
        
        do {  
            num /= 10;
        } while (posicion-- > 0);
        
        return num % 10;
    }
    
    public int posicionDeDigito(int num, int ocu){
        num = voltea(num);
        
        for (int i = 0; i < digitos(num); i++) {
            if (ocu == num % 10) {
                return i+1;
            }
            num /= 10;
        }
        return -1;        
    }
    
    public int quitaPorDetras(int num, int quitar){
        do {            
            num /= 10;
        } while (quitar > 0);
        
        return num;
    }
    
    public int quitaPorDelante(int num, int quitar){
        num = voltea(num);
        num = quitaPorDetras(num, quitar);
        
        return num;
    }
    
    public int pegarPorDetras(int num, int digito){
        return num *= 10 + digito;
    }
    
    public int pegarPorDelante(int num, int digito){
        num = voltea(num);
        num *= 10 + digito;
        num =  voltea(num);
        
        return num;
    }
    
    public int trozoDeNumeroo(int num, int inicio, int fin) {
        int longitud = digitos(num);
        
        num = quitaPorDelante(num, inicio);
        num = quitaPorDetras(num, longitud - fin - 1);
        
        return num;
    }
    
    public int juntaNumeros(int num1, int num2){
        return (num1 * potencia(10, digitos(num2))) + num2;
    }
}
