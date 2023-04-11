
package poo_ej2_circunferencia;

import Entidades.Circunferencia;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class POO_Ej2_Circunferencia {

    /**
     * Declarar una clase llamada Circunferencia que tenga como atributo 
     * privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
     
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Circunferencia C1 = new Circunferencia();
        
        System.out.println("Coloque el radio en centímetros");
        C1.crearCircunferencia(leer.nextFloat());
        
        C1.area(C1.getRadio());
        
        C1.perimetro(C1.getRadio());
        
        System.out.println("El área es: " + C1.getArea());
        System.out.println("El perímetro es: " + C1.getPerimetro());
    }
    
}
