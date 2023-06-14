
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    
    public Libro crearLibro(){
        
        Libro l = new Libro();
        
        System.out.println("Cual es el nombre del libro?");
        l.setTitulo(leer.next());
       // System.out.println("Cual es su numero ISBN?");
       // l.setISBN(leer.nextInt());
       // System.out.println("Cual es su Autor?");
       // l.setAutor(leer.next());
       // System.out.println("Cual es su numero de páginas?");
       // l.setNumeroDePaginas(leer.nextInt());
        
        return l;
    }
    
    public void informarLibro(Libro l){
        System.out.println("El nombre del libro es " + l.getTitulo());
      //  System.out.println("Su ISBN es " + l.getISBN());
      //  System.out.println("Su Autor es " + l.getAutor());
      //  System.out.println("Su numero de paginas es " + l.getNumeroDePaginas());
    }
    
    
}
