/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class Ej_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        int num2;
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();
        int num3;
        num3 = num1 + num2;
        System.out.println("El Resultado es: " + num3);
        
    }
}
