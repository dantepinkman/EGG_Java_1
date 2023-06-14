/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class Ej_3 {

 

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra con mayusculas y minusculas");
        frase = leer.nextLine();     //SI SOLAMENTE PONGO leer.next() SOLO VA A TOMAR LA PRIMER LETRA
        //frase = leer.next();
        //frase = toUpperCase();     //puedo usar esta funcion para directamente cambiar la palabra a mayusculas
        System.out.println("En Mayusculas: " + frase.toUpperCase());
        System.out.println("En Minusculas: " + frase.toLowerCase());
        

    }
}
