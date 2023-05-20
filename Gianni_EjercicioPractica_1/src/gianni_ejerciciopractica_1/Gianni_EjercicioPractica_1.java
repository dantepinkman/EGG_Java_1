
package gianni_ejerciciopractica_1;

import Entidades.HojaPerro;
import Servicios.HojaPerroServicio;

public class Gianni_EjercicioPractica_1 {

    public static void main(String[] args) {
        
        
        
        HojaPerroServicio hps = new HojaPerroServicio();
        HojaPerro hp = new HojaPerro();
        
        System.out.println(hp.getNombre());
        
        
        hps.agregarPerro();
        hps.mostrarPerro();
        System.out.println(hp.getNombre());
    }
    
}
