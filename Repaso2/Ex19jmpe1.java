import java.util.Scanner;

public class Ex19jmpe1 {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        int moneda= 0;
        int nummonedas= 0;
        boolean jugar=true;
        int premio = 0; 
        int premiototal= 0;


        //define rodillo como array con los valores
        String[] rodillos = {"sol","paraguas","nieve","meteorito"};

        //introduce monedas
        do {
             System.out.print("Introduzca la moneda con la que va a jugar (solo 1 o 2) : ");
            moneda=s.nextInt();
        } while (moneda<1 || moneda>2);

        while (jugar) {
            
            String rodillo1= RotarRodillo(rodillos);
            String rodillo2= RotarRodillo(rodillos);
            String rodillo3= RotarRodillo(rodillos);
            
      
            if (rodillo1.equals(rodillo2) && rodillo1.equals(rodillo3)) {
                premio = 100;
            }else if(rodillo1.equals(rodillo2) || rodillo1.equals(rodillo3) || rodillo2.equals(rodillo3)){
                premio=10;
            }else{premio=0;}
            

            
            System.out.printf(rodillo1+"\t"+rodillo2+"\t"+rodillo3+"\n");
            
            
            System.out.println("Premio obtenido: "+premio);
            System.out.println();            
            premiototal += premio;
            nummonedas++;



            System.out.println("¿Quiere seguir jugando?  (S/N)");
            String ss=s.next().toUpperCase();
            if (ss.equals("S")) {
                jugar=true;
            }
            if (ss.equals("N")) {
                System.out.println("Premio obtenido: "+premiototal);
                System.out.println("Dinero gastado: "+(moneda*nummonedas));
                int premioneto = (premiototal-(moneda*nummonedas));
               //si es negativo se muestra 0
                if (premioneto<0) {
                    premioneto=0;
                }
                System.out.println("Premio neto : "+premioneto);
                jugar = false;
            }
        }

        s.close();
    }
    public static String aleatorio(String[]rodillos) {
        
        String aleatorio = rodillos[(int)(Math.random()*rodillos.length)];
        return aleatorio;
    }

    public static String RotarRodillo(String[] rodillos) {
        
        String rodillo1 = aleatorio(rodillos);
        return rodillo1;
        
    }

    

    

}
    


