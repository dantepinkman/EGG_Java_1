package Guia_3;

import java.util.Scanner;

public class Ej_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = 0;
        int res;
        String respuesta = "no";

        do {
            System.out.println("MENU: "
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir"
                    + "\n5. Salir"
                    + "\n Seleccione una opción...");
            res = leer.nextInt();
            if (res > 0 && res < 6) {
                if (res == 1) {
                    num3 = num1 + num2;
                }
                if (res == 2) {
                    num3 = num1 - num2;
                }
                if (res == 3) {
                    num3 = num1 * num2;
                }
                if (res == 4) {
                    num3 = num1 / num2;
                }
                if (res == 5) {
                    num3 = 0;
                    System.out.println("Seguro que desea salir? S/N");
                    respuesta = leer.next();
                }
            } else {
                System.out.print("Respuesta Incorrecta... ");
            }
            if (res >= 1 && res <= 5) {
                System.out.println("El Resultado es: " + num3);
            }
        } while (!"S".equals(respuesta));
        System.out.println("Saliendo...");
    }
}
