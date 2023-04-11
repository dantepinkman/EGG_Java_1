package Guia_5;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ej_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese tamaño del vector");
        int n = leer.nextInt();

        int DosDigitos = 0;
        int TresDigitos = 0;
        int CuatroDigitos = 0;

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor para vector " + i);
            vector[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vector[i] <= 99 && vector[i] >= 10) {
                DosDigitos++;
            }
            if (vector[i] <= 999 && vector[i] >= 100) {
                TresDigitos++;
            }
            if (vector[i] <= 9999 && vector[i] >= 1000) {
                CuatroDigitos++;
            }
        }
        
        System.out.println("Cantidad de valores con dos digitos:_" + DosDigitos
                + "\nCantidad de valores con tres digitos:_" + TresDigitos
                + "\nCantidad de valores con cuatro digitos:_" + CuatroDigitos
        );
    }
}
