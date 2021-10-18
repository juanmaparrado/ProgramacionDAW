public class Ejercicio1{
	
	public static void main (String[] args) {
		System.out.println("Introduce el dia de la semana para decirte que tienes a primera hora(intoduce todo en minusculas)");
        String dia = System.console().readLine();
        switch (dia) {
        case "lunes":
            System.out.println("Entornos de Desarrollo");
            break;
        case "martes":
            System.out.println("Entornos de Desarrollo");
            break;
        case "miercoles":
            System.out.println("Lenguaje de marcas");
            break;
        case "jueves":
            System.out.println("Base de Datos");
            break;
        case "viernes":
            System.out.println("FOL");
            break;
        default:
            System.out.println("Ese dia no es correcto");
            break;
    } 
	}
}

