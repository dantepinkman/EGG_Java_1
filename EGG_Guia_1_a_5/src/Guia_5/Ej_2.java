/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package Guia_5;

import java.util.Scanner;

public class Ej_2 {

    public static void main(String[] args) {
        double aleatorio;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        double[] vector1 = new double[n];

        for (int i = 0; i < n; i++) {
            aleatorio = Math.round(Math.random() * 100);
            vector1[i] = aleatorio;
            System.out.println(vector1[i]);
        }

        System.out.println("Ingrese numero a buscar");
        int numero = leer.nextInt();

        for (int i = 0; i < n; i++) {
            if (numero == vector1[i]) {
                System.out.println("Se encontró en posicion " + i);
            }
        }
    }
}
