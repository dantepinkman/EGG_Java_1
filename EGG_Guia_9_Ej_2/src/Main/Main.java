
package Main;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosServicios;

public class Main {

   
    public static void main(String[] args) {
        
        ParDeNumerosServicios SV = new ParDeNumerosServicios();
        
        ParDeNumeros PN = SV.MostrarValores();
        
        SV.calcularPotencia(PN);
        SV.calcularRaiz(PN);
        
    }
    
}
