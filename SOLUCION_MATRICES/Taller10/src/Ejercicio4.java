import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        boolean start = true;
        Scanner sc = new Scanner(System.in);
        int fila, colum, cont=0;
        boolean gano = false;
        String dato;
        String juego[][] = { { " [ ] ", " [ ] ", " [ ] " },
                { " [ ] ", " [ ] ", " [ ] " },
                { " [ ] ", " [ ] ", " [ ] " }
        };
        System.out.println("===/TRES EN RAYA/===");
        do {
            System.out.println("    1    2    3");
            for (int i = 0; i < juego.length; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < juego[i].length; j++) {
                    System.out.print(juego[i][j]);
                }
                System.out.println();
            }
            do {
                System.out.println("Ingrese la fila (1-3)");
                fila = sc.nextInt();
                System.out.println("Ingrese la columna (1-3)");
                colum = sc.nextInt();
                System.out.println("Ingrese la X o 0");
                dato = sc.next().toUpperCase();
                fila--;
                colum--;
                if (fila < 0 & fila <= 3) {
                    System.out.println("Error de ingreso, vuelva a intentarlo.");
                } else if (colum < 0 & colum <= 3) {
                    System.out.println("Error de ingreso, vuelva a intentarlo.");
                } else if (juego[fila][colum].equals(" [X] ") || juego[fila][colum].equals(" [0] ")) {
                    System.out.println("Error de ingreso, esa poscion ya esta ocupada.");
                } else {
                    break;
                }
            } while (start);
            juego[fila][colum] = " [" + dato + "] ";
            cont++;
            for (int i = 0; i < juego.length; i++) {
                if (juego[i][0].equals(" [" + dato + "] ") && juego[i][1].equals(" [" + dato + "] ")&& juego[i][2].equals(" [" + dato + "] ")) {
                    start = false;
                    gano = true;
                    break;
                }
            }
            for (int i = 0; i < juego.length; i++) {
                if (juego[0][i].equals(" [" + dato + "] ") && juego[1][i].equals(" [" + dato + "] ") && juego[2][i].equals(" [" + dato + "] ")) {
                    start = false;
                    gano = true;
                    break;
                }
            }
            for (int i = 0; i < juego.length; i++) {
                if (juego[0][0].equals(" [" + dato + "] ") && juego[1][1].equals(" [" + dato + "] ")
                        && juego[2][2].equals(" [" + dato + "] ")) {
                    start = false;
                    gano = true;
                    break;
                }
            }
            if (cont==9) {
                break;
            }
        } while (start);
        if (gano) {
            System.out.println("FELICIDADES GAN0 " + dato);
        } else {
            System.out.println("EMPATE!");
        }
        for (int i = 0; i < juego.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < juego[i].length; j++) {
                System.out.print(juego[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
 * ===/TRES EN RAYA/===
    1    2    3
1  [ ]  [ ]  [ ]
2  [ ]  [ ]  [ ]
3  [ ]  [ ]  [ ]
Ingrese la fila (1-3)
1
Ingrese la columna (1-3)
1
Ingrese la X o 0
x
    1    2    3
1  [X]  [ ]  [ ]
2  [ ]  [ ]  [ ]
3  [ ]  [ ]  [ ]
Ingrese la fila (1-3)
1
Ingrese la columna (1-3)
2
Ingrese la X o 0
0
    1    2    3
1  [X]  [0]  [ ]
2  [ ]  [ ]  [ ]
3  [ ]  [ ]  [ ]
Ingrese la fila (1-3)
2
Ingrese la columna (1-3)
2
Ingrese la X o 0
x
    1    2    3
1  [X]  [0]  [ ]
2  [ ]  [X]  [ ]
3  [ ]  [ ]  [ ]
Ingrese la fila (1-3)
3
Ingrese la columna (1-3)
2
Ingrese la X o 0
0
    1    2    3
1  [X]  [0]  [ ]
2  [ ]  [X]  [ ]
3  [ ]  [0]  [ ]
Ingrese la fila (1-3)
3
Ingrese la columna (1-3)
3
Ingrese la X o 0
x
FELICIDADES GAN0 X
1  [X]  [0]  [ ]
2  [ ]  [X]  [ ]
3  [ ]  [0]  [X]
 */