/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia_3;

import java.util.Scanner;

/**
Crear un programa que pida una frase y si esa frase es igual
a “eureka” el programa pondrá un mensaje de Correcto,
sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */

public class Ej_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba la frase 'Eureka'...");
        String frase = read.next();
        
        if ("Eureka".equals(frase)) {
            System.out.println("La Frase es Correcta");
            
        } else {
            System.out.println("La Frase es incorrecta");
        }
        
    }
}
