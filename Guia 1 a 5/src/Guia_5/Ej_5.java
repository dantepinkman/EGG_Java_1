/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Guia_5;

import java.util.Scanner;

public class Ej_5 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int[][] matrizA = {{0, -2, 4},
                           {2, 0, 2},
                           {-4, -2, 0}};

        mostrarMatriz(matrizA);
        int[][] matrizB = new int[3][3];
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizB[i][j] = matrizA[j][i];

            }
        }
        System.out.println("");
        mostrarMatriz(matrizB);
        comprobarMatriz(matrizA, matrizB);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void comprobarMatriz(int[][] matrizA, int[][] matrizB) {
        int contador = 0;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {

                if (matrizA[i][j] == matrizB[i][j] * (-1)) {
                    //System.out.println("Correcto");
                    contador++;

                }

            }

        }
        System.out.println("");
        
        if (contador == matrizA.length * matrizA.length) {
            System.out.println("Es Correcto");
        } else {
            System.out.println("Es Incorrecto");
        }

    }

}
