public class adivinanumero {
    public static void main(String[] args) {
        int [] listaNumeros = {11223344,12345,998877,3456,987} ;
        int elegido,elegido2 ;
        int intentos;
        String desordenado = "";

        elegido = listaNumeros[(int)(Math.random()*listaNumeros.length)];
        elegido2 = elegido ;

        do {
            int digito = elegido2%10 ;
            elegido2 /= 10 ;
            if (Math.random()*2 >=1) {
                desordenado += digito ;
            }else{
                desordenado = ""+digito+desordenado;
            }
        } while (elegido2>0);

        intentos = 0 ;
        boolean acertado = false ;

        do {
            System.out.println("Tiene "+(5-intentos)+"intentos. Diga número con los digitos "+desordenado);
            int juego = Integer.parseInt(System.console().readLine());
            if (juego == elegido) 
                acertado = true;
            
            intentos++;
        } while (intentos<5 && !acertado);

        if (acertado) {
            System.out.println("Felicidades. Ha acertado el numero");
        }
        else{
            System.out.println("El número que tenía que acertar es: "+elegido);
        }
        
    }
}
