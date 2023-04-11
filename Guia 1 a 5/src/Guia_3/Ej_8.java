package Guia_3;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por
 * ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente: * * * * * * * *
 */
public class Ej_8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese tamaño");
        int N = leer.nextInt();
        int ancho = N;
        int alto = N;
        int n1 = N;

        do {
            System.out.print("* ");
            ancho--;
        } while (ancho > 0);
        System.out.println("");
        ancho = N;

        do {
            do {
                if (alto == N || alto == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                alto--;
            } while (alto > 0);
            System.out.println("");
            alto = N;
            n1--;
        } while (n1 - 2 > 0);

        do {
            System.out.print("* ");
            ancho--;
        } while (ancho > 0);
        System.out.println("");

    }
}
