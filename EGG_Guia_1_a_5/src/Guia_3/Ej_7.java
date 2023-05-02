package Guia_3;

import java.util.Scanner;

public class Ej_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una cadena de 5 caracteres maximo"
                + "\nDebe comenzar con X y terminar con O"
                + "\nIntroduce &&&&& para Salir...");
        String frase = leer.next();
        int longitud = frase.length();
        int ok = 0;
        int error = 0;

        do {
            if (longitud > 0 && longitud < 6 && frase.startsWith("X")
                    && frase.endsWith("O")) {
                ok++;
                System.out.println("Ok");
            } else {
                error++;
                System.out.println("Error");
            }
            System.out.println("Introduce otra Cadena"
                    + "\nO escribe &&&&& para salir.");
            frase = leer.next();

        } while (!frase.equals("&&&&&"));

        System.out.println("Valores Correctos: " + ok);
        System.out.println("Valores Erroneos: " + error);

    }
}
