package Main;

import Entidades.Libro;
import Servicios.LibroServicios;
import java.util.Scanner;

public class EGG_Guia_7_Ej_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n = 3;
        Libro[] l = new Libro[n];
        LibroServicios ls = new LibroServicios();
        
        for (int i = 0; i < l.length; i++) {
        l[i] = ls.crearLibro();
        }
        for (int i = 0; i < l.length; i++) {
        ls.informarLibro(l[i]);
        
        }

        

        /*
        System.out.println("Desea Conocer los datos del libro Ingresado?");
        if ("Si".equalsIgnoreCase(leer.next())) {
            ls.informarLibro();

        } else {

            System.out.println("Desea cambiar el titulo?");
            if ("Si".equalsIgnoreCase(leer.next())) {

                System.out.println("Escriba el nuevo Titulo...");
                //l.setTitulo(leer.next());
                //System.out.println(l.getTitulo());
                System.out.println("Los nuevos datos son:");
                ls.informarLibro();
            } else {
                System.out.println("ok");
            }
        }
*/
    }

}
