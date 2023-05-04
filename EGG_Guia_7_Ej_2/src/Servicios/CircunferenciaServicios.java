
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicios {
    
    Circunferencia C = new Circunferencia();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public int crearCircunferencia(){
        
        int radio;
        System.out.println("Cual es el radio?");
        radio = leer.nextInt();
        
        return radio;
    }
    
    
    
}
