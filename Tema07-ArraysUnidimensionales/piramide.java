public class piramide {
    public static void main(String[] args) {
        char c = '*';
         int h = 1;
        int numEspacios = h-1;
         int caracter = 1;

         for (int i = 0; i < h; i++) {
         
          //pintar espacios
             for (int j = 1; j<= numEspacios; j++) {
             System.out.print(" ");
             }
         
         
           //pintar caracteres
             for (int k = 1; k < h; k++) {
             System.out.print(c);
         }
             for (int k = h ; k > 0;k--){
             System.out.print(c);
         }
         
         System.out.println();
         ;      
         numEspacios-- ;
        
         }
}}
