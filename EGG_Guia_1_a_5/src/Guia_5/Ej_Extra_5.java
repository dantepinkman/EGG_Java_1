/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class Ej_Extra_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); //hay que usar use delimiter porque el nextlines aveces esta bugeado y sigue tomando datos
        System.out.println("Ingrese la dimension de la Matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                suma += matriz[i][j];

            }

        }
        System.out.println("La suma de los datos de la matriz es: " + suma);

    }
}
