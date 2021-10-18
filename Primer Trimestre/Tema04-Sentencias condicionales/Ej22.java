public class Ej22 {
	
	public static void main (String[] args) {
    String dia ;
    int hora;
    int minutos;
    int diaNum;
    System.out.println("Introduce un dia de la semana (Lunes a viernes)");
    dia = (System.console().readLine());
    
      switch(dia){
        case "lunes":
        diaNum = 4;
        break; 
        case "martes":
        diaNum = 3;
        break; 
        case "miercoles":
        diaNum = 2;
        break; 
        case "jueves":
        diaNum = 1;
        break; 
        case "viernes":
        diaNum = 0;
        break; 
        }
       System.out.println("Introduce la hora");
    hora = Integer.parseInt(System.console().readLine()); 
    System.out.println("Introduce los minutos");
    minutos = Integer.parseInt(System.console().readLine()); 
		
	}
}

