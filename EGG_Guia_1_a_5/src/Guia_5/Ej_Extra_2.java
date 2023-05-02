package Guia_5;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 */
public class Ej_Extra_2 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el Tamaño del Vector");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
       boolean resultado = true;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el Valor del Vector 1 en posicion " + i);
            vector1[i] = leer.nextInt();
            System.out.println("Ingrese el Valor del Vector 2 en posicion " + i);
            vector2[i] = leer.nextInt();

            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores no son Iguales");

            }

        }

        for (int j = 0; j < n; j++) {
            if (vector1[j] != vector2[j]) {
                 resultado = false;
                 j = n;
             }
         } 
        System.out.println("Los vectores son iguales? :" + resultado);
    }
}
