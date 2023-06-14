/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Guia_2;

import java.util.Scanner;

public class Ej_4 {
    public static void main(String[] args) {
        int gradosC;
        int gradosF;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una cantidad de Grados Celcius");
        gradosC = leer.nextInt();
        
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println("Eso equivale a " + gradosF + " grados Farenheit");
    }
}
