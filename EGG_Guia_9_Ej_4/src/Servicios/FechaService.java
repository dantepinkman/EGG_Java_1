package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    //  Date D = new Date();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {

        
        System.out.println("Cual es su año de Nacimiento");
        int anio = leer.nextInt();
        System.out.println("Cual es su mes de Nacimiento");
        int mes = leer.nextInt();
        System.out.println("Cual es su dia de Nacimiento");
        int dia = leer.nextInt();
        
        return new Date(anio - 1900, mes - 1, dia);
    }

    public Date fechaActual() {

        return new Date();
    }

    public int diferencia(Date fechaActual, Date fechaNacimiento) {

        int dif = fechaActual.getYear() - fechaNacimiento.getYear();

        return dif;
    }

}
