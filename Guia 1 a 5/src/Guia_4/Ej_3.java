package Guia_4;

import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta 
una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de 
euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje 
indicando el cambio (void).
El cambio de divisas es:
0.86 libras es un 1 €
1.28611 $ es un 1 €
129.852 yenes es un 1 €
 */
public class Ej_3 {

    public static void main(String[] args) {
        String moneda1 = "";
        String moneda2 = "";
        double valor1 = 0;
        double valor2 = 0;

        cambio(moneda1, moneda2, valor1, valor2);

    }

    public static void cambio(String moneda1, String moneda2, double valor1, double valor2) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una Moneda..."
                + "\nLibras"
                + "\nDolares"
                + "\nYenes");
        moneda1 = leer.next();
        System.out.println("Ingrese un valor en Euros...");
        valor1 = leer.nextInt();

        if (moneda1.equalsIgnoreCase("libras")) {
            valor2 = valor1 * 0.86;
        }
        if (moneda1.equalsIgnoreCase("Dolares")) {
            valor2 = valor1 * 1.28611;
        }
        if (moneda1.equalsIgnoreCase("Yenes")) {
            valor2 = valor1 * 129.852;
        }

        if (valor2 == 0) {
            System.out.println("Error, nombre mal introducido");
        } else {
            System.out.println("El valor de " + valor1 + " Euros corresponde a: " + valor2 + " " + moneda1);
        }

    }

}
