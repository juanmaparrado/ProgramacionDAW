import arraylist.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        /*
      Empleado listaEmpleados[] = new Empleado[3];
      listaEmpleados[0] = new Empleado("Ana", 45, 2500);
      listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
      listaEmpleados[2] = new Empleado("María", 25, 2600);*/

      ArrayList <Empleado>  listaEmpleados = new ArrayList<Empleado>();

      listaEmpleados.add(new Empleado("Ana", 45, 2500));

      listaEmpleados.add(new Empleado("Antonio", 55, 2000));

      listaEmpleados.add(new Empleado("María", 25, 2600));

      listaEmpleados.set(1, new Empleado("Olga", 22, 2200)); 

      listaEmpleados.add(new Empleado("Ana", 45, 2500));


      System.out.println(listaEmpleados.get(3).DameDatos());


      System.out.println(listaEmpleados.size());

/* recorrer array con un BUCLE FOR EACH 
  for (Empleado empleado : listaEmpleados) {
      System.out.println(empleado.DameDatos());
  }
*/

  Iterator<Empleado> iterador = listaEmpleados.iterator();

  while (iterador.hasNext()) {
      System.out.println(iterador.next().DameDatos());
  }


/*
Recorrer el array con un BUCLE FOR i
    for (int i = 0; i < listaEmpleados.size() ; i++) {
        Empleado e = listaEmpleados.get(i);
        System.out.println(e.DameDatos());
        
    }
*/



/*con esto lo que hacemos es copiar el array list en otro array para recorrerlo con un bucle convencional de array
    Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
    listaEmpleados.toArray(arrayEmpleados);
    for (int i = 0; i < arrayEmpleados.length; i++) {
        System.out.println(arrayEmpleados[i].DameDatos());
    }
*/







    }
}
