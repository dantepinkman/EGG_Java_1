
package Entidades;

import java.util.Scanner;

public class Cancion {
    public String título;
    public String autor;

    public Cancion() {
    }

    public Cancion(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void Lista(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba titulo y autor");
        título = leer.next(); autor = leer.next();
        
    }
    
}
