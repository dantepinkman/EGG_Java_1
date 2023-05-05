
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicios {
    
    Circunferencia C = new Circunferencia();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public void crearCircunferencia(){
       System.out.println("Cual es el radio?");
        C.setRadio(leer.nextInt());
    }
    
    public void calcularArea(){
        C.setCircunferencia(3.14 * Math.pow(C.getRadio(), 2));
    }
    
    public void calcularPerimetro(){
        C.setPerimetro(2 * 3.14 * C.getCircunferencia());
    }
    
    public void mostrar(){
        System.out.println("El radio es " + C.getRadio() + " por lo tanto el area es " + C.getCircunferencia() + " y el perimetro es " + C.getPerimetro());
    }
    
    
    
    
    
}
