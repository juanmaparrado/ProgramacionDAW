public class Ej1ArraysBi {
    public static void main(String[] args) {
        int[][] num = new int [3][6];
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 6; j++) {
                num[i][j] = (int)((Math.random())*1000);
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print(" "+ num[i][j]);
            }
        }
    }
}
