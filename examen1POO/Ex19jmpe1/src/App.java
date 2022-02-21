
import articulos.*;
import distribuidora.*;
import pedido.*;

public class App {
    public static void main(String[] args) throws Exception {

        distribuidora midistribuidora = new distribuidora ("PROGRAMAZON",100);

        midistribuidora.almacenarArticulo(new articuloalmacen("Teclado",200));
        midistribuidora.almacenarArticulo(new articuloalmacen("Ratón",25));
        midistribuidora.almacenarArticulo(new articuloalmacen("Impresora",1000));
        midistribuidora.almacenarArticulo(new articuloalmacen("CPU",187));

        pedido miPedido = new pedido("Pedido de material para IES Campanillas",3);
        miPedido.escribirObservacion("Entréguese en horario de 8:15 a 14:45");

        miPedido.añadirArticuloPedido(new articulopedido("Teclado",3));
        miPedido.añadirArticuloPedido(new articulopedido("Ratón",4));
        miPedido.añadirArticuloPedido(new articulopedido("CPU",2));

        System.out.println(midistribuidora.obtenerListado());
        System.out.println(miPedido.obtenerPedido());
        System.out.println("Después de atender el pedido ...");
        //miDistribuidora.servir(miPedido);
        System.out.println(midistribuidora.obtenerListado());
    }
}
