/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el
usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().

 */
package Guia_5;

import java.util.Scanner;

public class Ej_Extra_6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String[][] matriz = new String[20][20];

        do {
            System.out.println("Ingrese una palabra");
            String palabra = leer.next();

            int log = palabra.length();

            if (log >= 3 && log <= 5) {
                for (int j = 0; j < 20; j++) {
                   

                    }
                }

            

        } while ( true );

    }
}


/*
 switch (j) {
                        case 0:
                            matriz[i][j] = palabra.substring(j, j + 1);
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
*/
