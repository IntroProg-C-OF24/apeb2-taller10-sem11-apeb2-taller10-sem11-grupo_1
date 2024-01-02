import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        boolean condition = false;
        int fila, colum, fila1, colum1, factor1[][], factor2[][], resultado[][];
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCOJA LA OPERACION A REALIZAR | 1. Suma | 2. Resta ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                do {
                    System.out.println("Ingrese el tamaño de la primera matriz en filas");
                    fila = sc.nextInt();
                    System.out.println("Ingrese el tamaño de la primera matriz en columnas");
                    colum = sc.nextInt();
                    factor1 = new int[fila][colum];
                    System.out.println("Ingrese el tamaño de la segunda matriz en filas");
                    fila1 = sc.nextInt();
                    System.out.println("Ingrese el tamaño de la segunda matriz en columnas");
                    colum1 = sc.nextInt();
                    factor2 = new int[fila1][colum1];
                    if (fila != colum1 || colum != fila1) {
                        System.out.println("Las matrices no son cuadrada, vuelva a intentarlo.");
                        condition = true;
                    } else {
                        condition = false;
                    }
                } while (condition);
                resultado = new int[fila][colum1];
                for (int i = 0; i < factor1.length; i++) {
                    for (int j = 0; j < factor1[i].length; j++) {
                        factor1[i][j] = ran.nextInt(19) - 9;
                        factor2[i][j] = ran.nextInt(19) - 9;
                    }
                }
                System.out.println("Matrices a Sumar");
                System.out.println("Primera matriz");
                for(int i=0 ; i < factor1.length ; i++){
                    for(int j=0 ; j < factor1[i].length ;j++){
                        System.out.print(" ["+ factor1[i][j]+"]");
                    }
                    System.out.println();
                }
                System.out.println("Segunda matriz");
                for(int i=0 ; i < factor2.length ; i++){
                    for(int j=0 ; j < factor2[i].length ;j++){
                        System.out.print(" ["+ factor2[i][j]+"]");
                    }
                    System.out.println();
                }
                for (int i = 0; i < factor1.length; i++) {
                    for (int j = 0; j < factor1[0].length; j++) {
                        resultado[i][j] = factor1[i][j] + factor2[i][j];
                    }
                }
                System.out.println("RESULTADOS");
                for(int i=0 ; i < resultado.length ; i++){
                    for(int j=0 ; j < resultado[i].length ;j++){
                        System.out.print(" ["+ resultado[i][j]+"] ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                do {
                    System.out.println("Ingrese el tamaño de la primera matriz en filas");
                    fila = sc.nextInt();
                    System.out.println("Ingrese el tamaño de la primera matriz en columnas");
                    colum = sc.nextInt();
                    factor1 = new int[fila][colum];
                    System.out.println("Ingrese el tamaño de la segunda matriz en filas");
                    fila1 = sc.nextInt();
                    System.out.println("Ingrese el tamaño de la segunda matriz en columnas");
                    colum1 = sc.nextInt();
                    factor2 = new int[fila1][colum1];
                    if (fila != colum1 || colum != fila1) {
                        System.out.println("Las matrices no son cuadrada, vuelva a intentarlo.");
                        condition = true;
                    } else {
                        condition = false;
                    }
                } while (condition);
                resultado = new int[fila][colum1];
                for (int i = 0; i < factor1.length; i++) {
                    for (int j = 0; j < factor1[i].length; j++) {
                        factor1[i][j] = ran.nextInt(19) - 9;
                        factor2[i][j] = ran.nextInt(19) - 9;
                    }
                }
                System.out.println("Matrices a Restar");
                System.out.println("Primera matriz");
                for(int i=0 ; i < factor1.length ; i++){
                    for(int j=0 ; j < factor1[i].length ;j++){
                        System.out.print(" ["+ factor1[i][j]+"]");
                    }
                    System.out.println();
                }
                System.out.println("Segunda matriz");
                for(int i=0 ; i < factor2.length ; i++){
                    for(int j=0 ; j < factor2[i].length ;j++){
                        System.out.print(" ["+ factor2[i][j]+"]");
                    }
                    System.out.println();
                }
                for (int i = 0; i < factor1.length; i++) {
                    for (int j = 0; j < factor1[0].length; j++) {
                        resultado[i][j] = factor1[i][j] - factor2[i][j];
                    }
                }
                System.out.println("RESULTADOS");
                for(int i=0 ; i < resultado.length ; i++){
                    for(int j=0 ; j < resultado[i].length ;j++){
                        System.out.print(" ["+ resultado[i][j]+"] ");
                    }
                    System.out.println();
                }
                break;

            default:System.out.println("opcion incorrecta");
                break;
        }
        sc.close();
    }
}
