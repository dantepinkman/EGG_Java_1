package Servicios;

import Entidades.HojaPerro;
import java.util.Scanner;

public class HojaPerroServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HojaPerro hp = new HojaPerro();
    HojaPerro hp1 = new HojaPerro();
    HojaPerro hp2 = new HojaPerro();
    HojaPerro hp3 = new HojaPerro();
    
    String perro = hp.getNombre();
    
    public void agregarPerro() {
        
        System.out.println("Agrege un perro 1");
        hp.setNombre(leer.next());
        
        System.out.println("Agrege un perro 2");
        hp1.setNombre(leer.next());
        
    }
    
    public void mostrarPerro(){
        
        System.out.println(hp.getNombre());
        System.out.println(hp1.getNombre());
    }
    
}
