public class Ej22 {
	
	public static void main (String[] args) {
    String dia ;
    int hora;
    int minutos;
    int diaNum=   0;
    int Tminutos;
    int Fminutos;
    System.out.println("Introduce un dia de la semana (lunes a viernes)");
    dia = (System.console().readLine());
      switch(dia){
        case "lunes":
        diaNum = 0;
        break; 
        case "martes":
        diaNum = 1;
        break; 
        case "miercoles":
        diaNum = 2;
        break; 
        case "jueves":
        diaNum = 3;
        break; 
        case "viernes":
        diaNum = 4;
        break; 
        default : System.out.println("El dia es incorrecto");
        break;
        }
        
       System.out.println("Introduce la hora");
    hora = Integer.parseInt(System.console().readLine()); 
    System.out.println("Introduce los minutos");
    minutos = Integer.parseInt(System.console().readLine()); 
    Fminutos= ((24*60*diaNum)+(hora*60)+minutos) ;
    Tminutos = (4*24*60)+(15*60);
		System.out.println("Faltan "+(Tminutos-Fminutos)+" minutos para el fin de semana");
	}
}

