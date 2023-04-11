package Guia_4;

import java.util.Scanner;

public class Ej_2_bis {

    public static void main(String[] args) {

        String nombre = "";
        int edad = 0;
        String respuesta = "";
        String retorno = "";

        do{
        
        retorno = subprograma(nombre, edad, respuesta, retorno);
        
        }while(!retorno.equalsIgnoreCase("no"));
        
        System.out.println("Ok, Adios...");

    }

    public static String subprograma(String nombre, int edad, String respuesta, String retorno) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba Nombre");
        nombre = leer.next();
        System.out.println("Escriba edad");
        edad = leer.nextInt();

        System.out.print("Nombre: " + nombre + ", Edad: " + edad);
                
        
        if (edad < 18) {
            System.out.println(", Menor de edad");
        } else {
            System.out.println(", Mayor de edad");
        }

        System.out.println("Desea seguir ingresando datos?");
        respuesta = leer.next();

        return respuesta;

    }
}
