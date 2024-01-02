import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        Random ran = new Random();
        int lon = 3;
        int[][] matriz = new int[lon][lon];
        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ran.nextInt(19) - 9;
            }
        }
        for(int i=0 ; i < lon ; i++){
            for(int j=0 ; j < matriz[i].length ;j++){
                System.out.print(" ["+ matriz[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println("Elementos ubicados sobre la diagonal principal:");
        for (int i = 0; i < lon; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+",");
            }
        }
        System.out.println();
        System.out.println("Elementos ubicados bajo la diagonal principal:");
        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j]+",");
            }
        }
    }
}
