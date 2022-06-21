package repaso ;
import java.util.ArrayList;
import java.util.Scanner;


/*En esta entrada vamos a escribir un programa Java que crea un ArrayList 
de Objetos de tipo Coche. El programa pide por teclado los datos de 
los coches
 y los guarda en el array. A continuación utilizará el ArrayList para mostrar por pantalla lo siguiente:
Todos los coches introducidos.
Todos los coches de una marca determinada.
Todos los coches con menos de un número determinado de Kilómetros.
El coche con mayor número de Kilómetros.
Todos los coches ordenados por número de kilómetros de menor a mayor. */


public class main {
    static ArrayList<coche> listacoche = new ArrayList();
    public static void main(String[] args) {

        introducirCoches();
        System.out.println("Coches en garaje\n");
        mostrarPorMarca();
        

    }

    public static void introducirCoches() {
        Scanner s = new Scanner(System.in);
        coche c;
        int Num ;
        //introducimos el numero de coches que queremos añadir
        do {
            System.out.println("¿Cuantos coches quiere introducir?");
             Num = s.nextInt();
        } while (Num <0);
        //limpio el intro
        s.nextLine();
        //leo los datos de Num coches
        for (int i = 1; i <= Num; i++) {
            System.out.println("Datos del coche "+ i);
            System.out.println("introduce la matricula");
            String matr = s.nextLine();
            System.out.println("introduce la marca");
            String marca = s.nextLine();
            System.out.println("introduce el modelo ");
            String mod = s.nextLine();
            System.out.println("introduce los kilómetros ");
            int km = s.nextInt();
            s.nextLine();
            //limpio intro
         
            
            //creo un objeto coche con los atributos alamcenados
            c = new coche(matr, marca, mod, km);
            //se añade el objeto al arraylist
            listacoche.add(c);
        }
           s.close();
    }
    public static void mostrarCoches(){
        for (int i = 0; i < listacoche.size(); i++) {
            System.out.println("Coche "+i+1);
            System.out.println(listacoche.get(i));//se muestra invocando el tostring de la clase coche
        }
    }
    //Método para mostrar todos los coches de una marca que se pide por teclado                                   
    public static void mostrarPorMarca(){
        Scanner s = new Scanner(System.in);
        String marca;
        System.out.print("Introduce marca: ");
        marca = s.nextLine();
        s.close();

        System.out.println("Coches de la marca " + marca);

        for(int i = 0; i < listacoche.size(); i++){
            
            if(listacoche.get(i).getMarca().equalsIgnoreCase(marca)){
                System.out.println(listacoche.get(i));
            }else{

            }
                

        }
    }

    public static void mostrarPorKm(){
        Scanner s = new Scanner(System.in);
        int Km;
        System.out.print("Introduce número de kilómetros: ");
        Km = s.nextInt();
        System.out.println("Coches con menos de " + Km + " Km");
        for(int i = 0; i < listacoche.size(); i++){
            if(listacoche.get(i).getnumKm() < Km)
                System.out.println(listacoche.get(i));
        }
        s.close();
    }
    
}