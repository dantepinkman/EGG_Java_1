package Guia_5;

import java.util.Scanner;

public class Ej_Extra_4_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double mat[][] = new double[10][5];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del almuno: " + (i + 1));
            for (int j = 0; j < 5; j++) {
                if (j >= 0 && j <= 3) {
                    mat[i][j] = leer.nextDouble();
                } else {
                    mat[i][j] = (mat[i][0] * 10 / 100) + (mat[i][1] * 15 / 100) + (mat[i][2] * 25 / 100) + (mat[i][3] * 50 / 100);
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println("");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 4; j < 5; j++) {
                if (mat[i][j] >= 7) {
                    System.out.println("El alumno " + (i + 1) + " Aprobó con la nota: " + mat[i][j]);
                }
                if (mat[i][j] < 7) {
                    System.out.println("El almuno " + (i + 1) + " Desaprobó con la nota: " + mat[i][j]);
                }
            }
        }

    }
}
