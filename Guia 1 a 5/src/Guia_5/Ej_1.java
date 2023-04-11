
package Guia_5;


public class Ej_1 {
    public static void main(String[] args) {
        int[] vector1 = new int[100];
        for (int i = 0; i < 100; i++) {
            vector1[i] = i + 1;
            
        }
        for (int i = 99; i > 0; i--) {
            System.out.println(vector1[i]);
        }
    }
}
