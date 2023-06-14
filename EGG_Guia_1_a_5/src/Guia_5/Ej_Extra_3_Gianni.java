/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 *
 */
package Guia_5;

import java.util.Random;

public class Ej_Extra_3_Gianni {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] vector = new int[10];

        aleatorio(rand, vector);
        resultado(rand,vector);
    }

    public static void aleatorio(Random rand, int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(1000);

        }

    }

    public static void resultado(Random rand, int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);

        }
    }

}
