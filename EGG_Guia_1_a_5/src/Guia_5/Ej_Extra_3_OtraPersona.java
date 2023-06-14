/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_5;

import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector. 
 *
 */
public class Ej_Extra_3_OtraPersona {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese el tamaño deseado de su vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        rellenarvector(vector, n);
    }

    public static void rellenarvector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        escribirvector(vector, n);
    }

    public static void escribirvector(int[] vector, int n) {
        System.out.println("Su vector aleatorio es: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }
}
