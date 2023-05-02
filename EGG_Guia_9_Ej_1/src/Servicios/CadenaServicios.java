package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena Cad) {

        int contador = 0;
        char vector[] = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < Cad.getLongFrase(); i++) {

            for (int j = 0; j < vector.length; j++) {

                if (Cad.getFrase().charAt(i) == vector[j]) {
                    contador++;
                }

            }

        }

        System.out.println("La cantidad de vocales encontradas son: " + contador);

    }

    public void invertirFrase(Cadena Cad) {

        for (int i = Cad.getLongFrase() - 1; i >= 0; i--) {
            System.out.print(Cad.getFrase().charAt(i));
        }
        System.out.println("");

    }

    public void vecesRepetido(Cadena Cad) {
        int contador = 0;
        String letra;
        char letra2;

        System.out.println("Ingrese una letra...");
        letra = leer.next();
        letra2 = letra.charAt(0);

        for (int i = 0; i < Cad.getLongFrase(); i++) {
            if (letra2 == Cad.getFrase().charAt(i)) {
                contador++;
            }
        }
        System.out.println("La cantidad de veces que se encuentra la letra es: " + contador);

    }

    public void compararLongitud(Cadena Cad) {

        System.out.println("Ingrese una palabra");
        String palabra = leer.next();

        if (palabra.length() == Cad.getLongFrase()) {
            System.out.println("Son igual longitud.");
        } else {
            System.out.println("Son diferente longitud.");
        }

    }

    public void unirFrases(Cadena Cad) {
        System.out.println("Ingrese una frase...");
        String palabra = leer.next();
        String palabra2 = Cad.getFrase() + " " + palabra;

        System.out.println(palabra2);

    }

    public void reemplazar(Cadena Cad) {
        System.out.println("Ingrese una letra...");
        String letra = leer.next();
        char letra2 = letra.charAt(0);
        String frase = "";

        for (int i = 0; i < Cad.getLongFrase(); i++) {

            if ('a' == Cad.getFrase().charAt(i)) {

                //System.out.print(letra2);
                frase += letra2;

            } else {

                //System.out.print(Cad.getFrase().charAt(i));
                frase += Cad.getFrase().charAt(i);
            }
        }
        //System.out.println("");
        System.out.println(frase);
    }
    
    public void contiene(Cadena Cad) {
        System.out.println("Ingrese una letra...");
        
        String letra = leer.next();
        boolean contiene = false;
        char letra2 = letra.charAt(0);
        
        for (int i = 0; i < Cad.getLongFrase(); i++) {
            
            if (letra2 == Cad.getFrase().charAt(i)) {
                contiene = true;
            } 
        }
        System.out.println("Se econtro la letra en la frase?: " + contiene);
        
    }
    

}
