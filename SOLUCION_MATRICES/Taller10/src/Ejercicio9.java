public class Ejercicio9 {
    public static void main(String[] args) {
        int filas = 4;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
