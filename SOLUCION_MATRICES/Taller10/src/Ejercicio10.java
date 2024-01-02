public class Ejercicio10 {
    public static void main(String[] args) {
        int filas = 7;
        for (int i = 1; i <= filas; i += 2) {
            for (int j = filas - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = filas - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
