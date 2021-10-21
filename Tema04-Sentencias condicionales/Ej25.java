public class Ej25 {
    public static void main(String[] args) {
        int alto;
        int ancho;
        String escudo;
        double precioescudo=0.0;
        double precio = 0.0;
        final  double gastos = 3.25;
        
     System.out.println("Introduce la altura de la bandera en cm");
     alto = Integer.parseInt(System.console().readLine());
     System.out.println("Introduce el ancho de la bandera en cm");
     ancho = Integer.parseInt(System.console().readLine());
     System.out.println("¿Quieres escudo bordado?(s/n)");
     escudo = (System.console().readLine().toLowerCase());

     if (escudo == "s") {
         precioescudo = 2.50;
         
     } else if (escudo == "n"){
          precioescudo = 0;
         
     }

     precio= (ancho*alto/100)+precioescudo+gastos;
     System.out.println("El area de la bandera es "+ancho*alto);
     System.out.println("El precio de la bandera es "+ancho*alto/100);
     System.out.println("Su eleccion sobre el escudo cuesta  "+precioescudo);
     System.out.println("Los gastos de envio son "+gastos);
     System.out.println("El precio total es "+precio);

     
    
    }

}