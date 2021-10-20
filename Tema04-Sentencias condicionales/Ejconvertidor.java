/*
Realice un programa que convierta a 5 divisas una cantidad dada:

euro
dolar
libra
yen
yuan

Busque los factores de conversión en internet.

El programa solicitará al usuario la divisa de entrada, así como la cantidad de dinero en dicha
divisa.

Una vez realice los cálculos oportunos, el programa mostrará la equivalencia de la cantidad de
dinero introducida en las 5 divisas indicadas.
*/
public class Ejconvertidor {
    public static void main(String[] args) throws Exception {
        String moneda;
        Double euro= 0.0;
        Double dolar=0.0;
        Double libra=0.0;
        Double yuan=0.0;
        Double yen=0.0;
        
        final Double FACT_EURO_DOLAR = 1.16;
        final  Double FACT_EURO_LIBRA = 0.84;
        final Double FACT_EURO_YUAN = 7.43;
        final Double FACT_EURO_YEN = 133.06;
        System.out.println("Introduce la cantidad que desea convertir");
        euro = Double.parseDouble(System.console().readLine());
        System.out.println("Introduce con que divisa esta trabajando por defecto trabaja con el euro");
        moneda = System.console().readLine();

        switch (moneda) {
            case "euro":
             
            break;
            case "dolar":
                euro /= FACT_EURO_DOLAR;
                break;
            case "libra":
                euro /= FACT_EURO_LIBRA;
                break;
            case "yuan":
            euro/=FACT_EURO_YUAN;
                break;
            case "yen":
            euro /= FACT_EURO_YEN;
                break;
            default:
                break;
                
        
        }
        dolar = euro*FACT_EURO_DOLAR;
        libra = euro*FACT_EURO_LIBRA;
        yuan = euro*FACT_EURO_YUAN;
        yen = euro*FACT_EURO_YEN;
        
        System.out.println("Son "+euro+"euros");
        System.out.println("Son "+dolar+" dolares");
        System.out.println("Son "+libra+" libras");
        System.out.println("Son "+yuan+" yuan");
        System.out.println("Son "+yen+" yen");
    }
}
