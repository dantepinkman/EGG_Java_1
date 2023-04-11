/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_5;

import java.util.Scanner;

/**
 * 1-Realizar un algoritmo que calcule la suma de todos los elementos de un
 * vector de tamaño N, con los valores ingresados por el usuario.
 */
public class Ej_Extra_1 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int suma = 0;

        System.out.println("Ingresa el Tamaño");
        int tamano = leer.nextInt();

        int[] vector = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.println("Ingrese el valor para la posicion " + i);
            vector[i] = leer.nextInt();
            suma += vector[i];
        }

        System.out.println("El Resultado es " + suma);

    }

}
