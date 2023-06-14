package egg_guia_9_extra_ej_1;

import Entidades.Meses;
import java.util.Scanner;

public class EGG_Guia_9_Extra_Ej_1 {

    public static void main(String[] args) {

        Meses m = new Meses();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String respuesta;

        do {

            System.out.println("adivine el mes");
            respuesta = leer.next();

            if (respuesta.equalsIgnoreCase(m.getMesSecreto())) {
                System.out.println("Es correcto");
            } else {
                System.out.println("Es incorrecto");
            }

        } while (!respuesta.equalsIgnoreCase(m.getMesSecreto()));

    }
    
    int asd = 1;

}