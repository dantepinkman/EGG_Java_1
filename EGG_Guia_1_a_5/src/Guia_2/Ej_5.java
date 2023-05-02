/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package Guia_2;

import java.util.Scanner;

public class Ej_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double num;
        System.out.println("Ingrese numero (recomendado 16)");
        num = leer.nextInt(); //tambien se puede utilizar "double num = leer.nextInt();" y ya no es neccesario asignarlo arriba
        
        double num0 = num * 2;
        double num1 = num * 3;
        double num2 = Math.sqrt(num);
        
        System.out.println("El doble " + num + " es " + num0);
        System.out.println("El triple " + num + " es " + num1);
        System.out.println("La raiz cuadrada de " + num + " es " + num2);

        // Igual pero el resulado directamente en el println
        
        System.out.println("Escriba un numero");
        num = leer.nextDouble();
        System.out.println("La raiz cuadrada de ese numero es: " + Math.sqrt(num));

    }
}
