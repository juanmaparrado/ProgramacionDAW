package repasoobjetos;


import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        HashMap<String,Persona> listapersona = new HashMap<String,Persona>();

        Persona p = new Persona("322413","Juan");
        Persona p1 = new Persona("243213","Paco");
        Persona p2 = new Persona("323241","Ana");
        Persona p3 = new Persona("224133","Antonio");

        listapersona.put("Juan", p);
        listapersona.put("Paco", p1);
        listapersona.put("Ana", p2);
        listapersona.put("Antonio", p3);
      

        Scanner s = new Scanner(System.in);
        int opc = 1 ;

        do {
            System.out.println("\n Introduzca el nº de la tarea a realizar");
            System.out.println("---------------------------------------");
            System.out.println("1.- Añadir Persona Lectora");
            System.out.println("2.-Añadir Libro a persona dando su nombre");
            System.out.println("3.- Presentar libros que ha leido una persona por su nombre");
            System.out.println();
            opc = s.nextInt();

            switch (opc) {
              
                case 1 : 

                    System.out.println("introduce el nombre de la persona");
                    String nombre = s.next();
                   
                    System.out.println("Introduce el DNI");
                    String dni = s.next();

                    
                    Persona persona = new Persona(dni,nombre);
                    listapersona.put(nombre,persona);
               

                    System.out.println("PERSONA INTRODUCIDA CORRECTAMENTE");
                    break;
                case 2 : 

                    System.out.println("Introduce el nombre de la persona lectora");
                    nombre = s.next();

                    if (listapersona.containsKey(nombre)) {
                        System.out.println();
                        System.out.print("Introduzca el libro: ");
                        String titulo= s.next();
                        System.out.print("Introduzca el autor: ");
                        String autor= s.next();

                        listapersona.get(nombre).nuevolibro(new Libro(titulo, autor));
                        System.out.println("LIBRO INTRODUCIDO");
                        System.out.println();
                    }else {
                        System.out.println("Esta persona no existe");
                    }
                    

                    break;

                case 3 : 
                        System.out.println("Introduce el nombre de la persona lectora");
                        nombre = s.next();
                       System.out.print( listapersona.get(nombre).toString());
                    break;
                default:
                    break;
            }
        } while (opc !=0);






        s.close();
       
    }
}
