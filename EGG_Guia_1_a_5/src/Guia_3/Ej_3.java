/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia_3;

import java.util.Scanner;

/**
* Realizar un programa que solo permita introducir 
* solo frases o palabras de 8 de largo. 
* Si el usuario ingresa una frase o palabra de 8 de 
* largo se deberá de imprimir un mensaje por pantalla
* que diga “CORRECTO”, en caso contrario, se deberá 
* imprimir “INCORRECTO”. 
* Nota: investigar la función Lenght() en Java.

 */
public class Ej_3 {
    public static void main(String[] args) {
        Scanner READ = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba una palabra de 8 Caracteres");
        String palabra = READ.next();
        int longitud = palabra.length();
        
        if (longitud == 8) {
            System.out.println("ok");
        } 
        else if (longitud <= 7) {
            System.out.println("Solo tiene " + longitud + " Caracteres");
        }
        else if (longitud >= 9) {
            System.out.println("Tiene demasiados Caracteres (" + longitud + ")");
        }
        else{
            System.out.println("Opcion Incorrecta");
        }
    }
}
