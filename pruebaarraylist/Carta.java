package pruebaarraylist;

public class Carta {
   
    private int num;
    private String palo;

    public Carta(int num ,String palo) {
        this.num = num;
        this.palo = palo;
    }

    public void imprimir() {
        System.out.print( num +" de "+palo+ "\n" );
    }
}
