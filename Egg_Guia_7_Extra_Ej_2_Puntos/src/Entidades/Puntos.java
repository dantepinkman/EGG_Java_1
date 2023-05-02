package Entidades;

import java.util.Scanner;

public class Puntos {

    int x1;
    int x2;
    int y1;
    int y2;

    public void CrearPuntos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese los dos numeros de X");
        x1 = leer.nextInt();
        x2 = leer.nextInt();
        System.out.println("Ingrese los dos numeros de Y");
        y1 = leer.nextInt();
        y2 = leer.nextInt();
    }

    public double Distancia() {
        double resultado;
        resultado = Math.sqrt(Math.pow((x1 - y1), 2) + Math.pow((x2 - y2), 2));
        //Math.pow(base, exponente)
        //System.out.println(resultado);

        return resultado;
    }

}
