package pruebaarraylist;

import java.util.ArrayList;

public class Mazo {
        private ArrayList<Carta> cartas = new ArrayList<Carta>();

    public Mazo(){
        ArrayList<Carta> cartas = new ArrayList<Carta>();
        cartas.add(new Carta(1,"TREBOL"));
        cartas.add(new Carta(2,"TREBOL"));
        cartas.add(new Carta(3,"TREBOL"));
        cartas.add(new Carta(4,"TREBOL"));
        cartas.add(new Carta(5,"TREBOL"));
        cartas.add(new Carta(6,"TREBOL"));
        cartas.add(new Carta(7,"TREBOL"));
        cartas.add(new Carta(8,"TREBOL"));
        this.cartas = cartas;
    }

    public void imprimir() {
       for (Carta carta : cartas) {
        carta.imprimir();
       }
        
       
    }

    public void barajar() {

        ArrayList<Carta> barajascartas = new ArrayList<Carta>();

        for (int i = 0; i < cartas.size(); i++) {
            int aleatorio = (int)(Math.random()*(cartas.size())) ;
            barajascartas.add(cartas.get(aleatorio));
            
        }
        this.cartas = barajascartas;
    }

    public static void main(String[] args) {
        Mazo mazo1 = new Mazo();
       mazo1.imprimir();
       mazo1.barajar();
       System.out.println();
       System.out.println();
       mazo1.imprimir();
    }
}
 