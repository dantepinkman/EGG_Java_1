package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Persona Per = new Persona();

    public boolean esMayorDeEdad() {
        if (Per.getEdad() >= 18) {
            System.out.println("La persona es mayor de edad");
            return true;
        } else {
            System.out.println("La persona es menor de edad");
            return false;
        }

    }

    public Persona crearPersona() {

        //System.out.println("Como se llama la persona:");
        //Per.setNombre(leer.next());
        System.out.println("Cual es su edad:");
        Per.setEdad(leer.nextInt());
        //System.out.println("Cual es su sexo:");
        //Per.setSexo(leer.next().charAt(0));
        System.out.println("Cual es su peso:");
        Per.setPeso(leer.nextDouble());
        System.out.println("Cual es su altura:");
        Per.setAltura(leer.nextDouble());

        return Per;
    }

    public int calcularIMC(Persona Per) {

        double IMC = Per.getPeso() / (Math.pow(Per.getAltura(), 2));
        System.out.println("IMC: " + IMC);

        if (IMC < 20) {

            System.out.println("Tiene peso bajo");
            return -1;
        } else if (IMC > 25) {
            System.out.println("Tiene Sobrepeso");
            return 1;
        } else {
            System.out.println("tiene peso ideal");
            return 0;
        }

    }

}
