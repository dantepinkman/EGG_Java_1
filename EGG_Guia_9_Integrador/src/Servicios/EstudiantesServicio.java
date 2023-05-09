package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

public class EstudiantesServicio {

    Estudiante[] estudiantes = new Estudiante[5];
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarEstudiante() {

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Cual es el nombre del estudiante " + (i+1) + " ?");
            String nombre = leer.next();
            System.out.println("Cual es su nota?");
            Double nota = leer.nextDouble();

            estudiantes[i] = new Estudiante(nombre, nota);
        }
    }

    public void mostrarEstudiante() {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print(estudiantes[i].getNombre() + ": ");
            System.out.println(estudiantes[i].getNota());
        }
    }

    public void promedioNotas() {
        double suma = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            suma = estudiantes[i].getNota() + suma;
        }
        double promedio = suma / estudiantes.length ;
        System.out.println("El promedio es " + promedio);
        
        
        for (int i = 0; i < estudiantes.length; i++) {
            if (promedio < estudiantes[i].getNota()) {
                System.out.println(estudiantes[i].getNombre() + " tiene una nota mayor al promedio.");
            }
        }
        
    }

}
