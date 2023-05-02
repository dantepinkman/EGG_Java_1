
package Guia_2;

import java.util.Scanner;

public class Ej_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese su Nombre");
        String nombre;
        nombre = leer.next();
        
        System.out.println("Su nombre es: " + nombre);
        
    }
}
