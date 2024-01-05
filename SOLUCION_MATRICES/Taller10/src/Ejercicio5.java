import java.util.Scanner;
import java.util.Random;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicion = true;
        int fila, colum, fila1, colum1, factor1[][], factor2[][], resultado[][];
        Random ran = new Random();
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
            if (colum != fila1) {
                System.out.println("Las dimensiones ingresadas son incorrectas, par la multiplicacion de matrices la primera debe tener el mismo número de columnas que filas la segunda");
            }else{
                condicion = false;
            }
        } while (condicion);
        resultado = new int[fila][colum1];
        System.out.println("LLENADO DE MATRICES CON NUMEROS ENTRE -9 Y 9");
        for(int i=0 ; i < factor1.length ; i++){
            for(int j=0 ; j < factor1[i].length ;j++){
                factor1[i][j] = ran.nextInt(19) - 9;
            }
        }
        for(int i=0 ; i < factor2.length ; i++){
            for(int j=0 ; j < factor2[i].length ;j++){
                factor2[i][j] = ran.nextInt(19) - 9;
            }
        }
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
        System.out.println("============");
        System.out.println("RESULTADOS");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                for (int k = 0; k < resultado.length; k++) {
                    resultado[i][j] += factor1[i][k] * factor2[k][j];
                }
            }
        }
        for(int i=0 ; i < resultado.length ; i++){
            for(int j=0 ; j < resultado[i].length ;j++){
                System.out.print(" ["+ resultado[i][j]+"] ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
 * Ingrese el tamaño de la primera matriz en filas
2
Ingrese el tamaño de la primera matriz en columnas
3
Ingrese el tamaño de la segunda matriz en filas
3
Ingrese el tamaño de la segunda matriz en columnas
2
LLENADO DE MATRICES CON NUMEROS ENTRE -9 Y 9
Primera matriz
 [7] [2] [2]
 [5] [1] [-6]
Segunda matriz
 [9] [-5]
 [4] [9]
 [9] [-5]
============
RESULTADOS
 [71]  [-17]
 [49]  [-16]
 */