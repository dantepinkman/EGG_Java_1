package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class Ej_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int retorno = 0;
        String palabra = " ";

        System.out.println("Ingrese la opcion deseada..."
                + "\n1-Sumar:"
                + "\n2-Restar"
                + "\n3-Multiplicar"
                + "\n4-Dividir");
        int opcion = leer.nextInt();

        if (opcion == 1) {
            retorno = sumar(num1, num2);
            palabra = "Suma";
        }
        if (opcion == 2) {
            retorno = restar(num1, num2);
            palabra = "Resta";
        }
        if (opcion == 3) {
            retorno = multiplicar(num1, num2);
            palabra = "Multiplicacion";
        }
        if (opcion == 4) {
            retorno = division(num1, num2);
            palabra = "Division";
        }

        System.out.println("La " + palabra + " de los dos numeros es " + retorno);

    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }
    
    public static int multiplicar(int num1, int num2){
        int multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion; 
    }
    
    public static int division(int num1, int num2){
        int division;
        division = num1 / num2;
        return division;
    }

}
