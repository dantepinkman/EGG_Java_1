
package Main;

import Servicios.CircunferenciaServicios;


public class main {
    public static void main(String[] args) {
        
        CircunferenciaServicios cs = new CircunferenciaServicios();
        
        cs.crearCircunferencia();
        cs.calcularArea();
        cs.calcularPerimetro();
        cs.mostrar();

    }
}
