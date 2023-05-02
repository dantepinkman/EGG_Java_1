package Entidades;

import java.util.Scanner;

public class Operacion {

    private int numero1, numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los dos numeros");
        this.numero1 = leer.nextInt();
        this.numero2 = leer.nextInt();
    }

    public int sumar() {
        int resultado = numero1 + numero2;
        return resultado;
        
        //return numero1 + numero2;
    }

    public int restar() {
        int resultado = numero1 - numero2;
        return resultado;
    }

    public int multiplicar() {
        int resultado;
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR");
            resultado = 0;

        } else {
            resultado = numero1 * numero2;
        }
        return resultado;
    }

    public double dividir() {
        double resultado;
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR");
            resultado = 0;

        } else {
            resultado = numero1 / numero2;
        }
        return resultado;
    }

}
