public class Ejconvertidor {
    public static void main(String[] args) throws Exception {
        String moneda;
        Double euro =0.0 ;
        Double dolar=0.0 ;
        Double libra=0.0 ;
        Double yuan=0.0 ;
        Double yen=0.0 ;
       
        final Double FACT_EURO_DOLAR = 1.16;
        final  Double FACT_EURO_LIBRA = 0.84;
        final Double FACT_EURO_YUAN = 7.43;
        final Double FACT_EURO_YEN = 133.06;
        System.out.println("Introduce la cantidad que desea convertir");
        euro = Double.parseDouble(System.console().readLine());
        System.out.println("Introduce con que divisa esta trabajando");
        moneda = System.console().readLine();

        switch (moneda) {
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
        System.out.println("Son "+dolar+" dolares");
        System.out.println("Son "+libra+" libras");
        System.out.println("Son "+yuan+" yuanes");
        System.out.println("Son "+yen+" yenes");
    }
}
