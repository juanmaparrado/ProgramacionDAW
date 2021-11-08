import java.util.Scanner;
public class piramideinvertida{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la altura de la pimera pirámide: ");
        int h1=s.nextInt();
        System.out.println("Introduce la altura de la segunda pirámide: ");
        int h2=s.nextInt();
        s.close();

        int hmax;
        int espacios1=0;
        int asteriscos1=(h1+(h1-1));
        int espacios2=0;
        int asteriscos2=(h2+(h2-1));
        int espaciosultimos=(h1+(h1-1));

        if(h1>h2){
            hmax=h1;
        }
        else{
            hmax=h2;
        }
        for(int i=0;i<hmax;i++){
                if(espacios1<(h1)){
                for(int x=0;x<espacios1;x++){
                    System.out.print(" ");
                }
                for(int x=0;x<asteriscos1;x++){
                    System.out.print("*");
                }
                for(int x=0;x<espacios1;x++){
                    System.out.print(" ");
                }
                }
                else{
                    for(int j=0;j<espaciosultimos;j++){
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
                for(int x=0;x<espacios2;x++){
                    System.out.print(" ");
                }
                for(int x=0;x<asteriscos2;x++){
                    System.out.print("*");
                }
                for(int x=0;x<espacios2;x++){
                    System.out.print(" ");
                }
                espacios1++;
                asteriscos1-=2;
                espacios2++;
                asteriscos2-=2;
                System.out.println();
            }
            
            }
        }
