package Guia_4;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 * @author Gianni
 */
public class Ej_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String name = "";
        int edad = 0;
        String respuesta = "";
        String retorno = "";

        do {

            System.out.println("Ingrese Nombre y Edad...");
            name = leer.next();
            edad = leer.nextInt();

            retorno = datos(name, edad, respuesta);

            if (retorno.equals("mayor")) {
                System.out.println("...Mayor de edad");
            } else {
                System.out.println("...Menor de edad");
            }

            System.out.println("Desea seguir ingresando usuarios ?...");
            respuesta = leer.next();

        } while (!respuesta.equals("No"));
        
        System.out.println("Saliendo...");
    }

    public static String datos(String name, int edad, String respuesta) {
        
        String resultado;

        System.out.println("Nombre: " + name
                + "\nEdad: " + edad);
        if (edad > 17) {
            resultado = "mayor";
        } else {
            resultado = "menor";
        }

        return resultado;

    }
}
