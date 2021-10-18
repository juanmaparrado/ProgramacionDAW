public class Ej21 {
	
	public static void main (String[] args) {
    double nota1;
    double nota2;
    double notafinal;
    String recuperacion;
    
    
		System.out.println("Este programa calcula la nota media del trimestre de PROG");
    System.out.println("Introduce la nota del primer examen");
    nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la nota del segundo examen");
    nota2 = Double.parseDouble(System.console().readLine());
    notafinal= (nota1+nota2)/2 ;
    if (notafinal >= 5) {
      System.out.println("LA NOTA MEDIA DE PROGRAMACION ES "+notafinal);
      }
      else if (notafinal < 5) {
        System.out.println("¿Cuál ha sido el resultado de la recuperacion?(apto/no apto)");
        recuperacion = (System.console().readLine());
        if ("apto".equals(recuperacion)){
          System.out.println("LA NOTA MEDIA DE PROGRAMACION ES 5");
          }
          else{
            System.out.println("LA NOTA MEDIA DE PROGRAMACION ES "+notafinal);
            }
        
        }
    
    
  }
}

