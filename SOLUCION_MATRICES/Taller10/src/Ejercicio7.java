import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        int lon = 3;
        int[][] matrix = new int[lon][lon];

        Random random = new Random();

        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < lon; j++) {
                matrix[i][j] = random.nextInt(19) - 9;
            }
        }

        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < lon; j++) {
                System.out.print("["+matrix[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("Elementos ubicados sobre la diagonal secundaria:");
        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < lon - 1 - i; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
        }
        System.out.println();
        System.out.println("Elementos ubicados bajo la diagonal secundaria:");
        for (int i = 0; i < lon; i++) {
            for (int j = lon - 1 - i; j < lon; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
        }
    }
}
