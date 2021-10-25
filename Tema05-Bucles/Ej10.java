public class Ej10 {
    /*REESCRITO         OPCION 2 */
    public static void main(String[] args) {    
        int ndigitos=0;
        float notaUsuario = 0;
        float notas= 0;
        System.out.println("Introduce el numero de notas que tienes");
        ndigitos=Integer.parseInt(System.console().readLine());
        for (int i = 0; i < ndigitos; i++) {
            System.out.println("Introduce la nota del examen");
            notaUsuario=Float.parseFloat(System.console().readLine());
            notas += notaUsuario; 
        }
           
        System.out.println("La media es "+(notas/ndigitos));
            
            
        
    }
}
