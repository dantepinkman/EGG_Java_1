/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia_3;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo,
 * y a continuación solicite números al usuario hasta que la suma 
 * de los números introducidos supere el límite inicial.
 * @author Gianni
 */
public class Ej_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero de base");
        int num = leer.nextInt();
        
        int num1;
        int num2 = 0;
        
        while (num >= num2){
            System.out.println("Ingrese un numero mas pequeño");
        num1 = leer.nextInt();
        num2 = num1 + num2;
        }
        
        if (num < num2){
            System.out.println("La suma de los numeros pequeños [" + num2 + "] es mas grande que el base [" + num + "]");
        }
    }
}
