package Servicios;

import Entidades.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Persona Per = new Persona();

    public Persona crearPersona() {

        System.out.println("Cual es su nombre...");
        Per.setNombre(leer.next());

        System.out.println("Cual es su año de nacimiento...");
        int anio = leer.nextInt();
        System.out.println("Cual es su mes de nacimiento...");
        int mes = leer.nextInt();
        System.out.println("Cual es su día de nacimiento...");
        int dia = leer.nextInt();

        Date edad = new Date(anio-1900, mes, dia);
        Per.setNacimiento(edad);

        return new Persona();
    }

    public int calcularEdad() {

        Date nacimiento = Per.getNacimiento();
        Date actual = new Date();

        int nacimientoanio = nacimiento.getYear();
        int actualanio = actual.getYear();

        int edad = actualanio - nacimientoanio;

        return edad;
    }

    public boolean menorQue(int edad) {

        System.out.println("Seleccione una edad...");
        int respuesta = leer.nextInt();
        boolean aux = false;

         if (edad > respuesta) {
            aux = true;
        } else {
            aux = false;
        }
         
        //System.out.println(aux);
        //System.out.println(edad);
        //System.out.println(respuesta);
        
        return edad > respuesta;  // <- metodo resumido

    }

    public void mostrarPersona(boolean menorQue, int calcularEdad) {

        System.out.println("El nombre de la persona es " + Per.getNombre());
        System.out.println("Su fecha de nacimiento es " + new SimpleDateFormat("yyyy,mm,dd").format(Per.getNacimiento()));
        System.out.println("Su edad es " + calcularEdad);
        
        //System.out.println(menorQue);
        
        if (menorQue == true) {
            System.out.println("La persona es menor que la edad suministrada");
        } else {
            System.out.println("La persona es mayor que la edad suministrada");
        }

    }

}
