
package egg_guia_11_ej_02;

import Entidades.Baraja;
import Servicios.BarajaServicio;

public class EGG_Guia_11_Ej_02 {

    public static void main(String[] args) {
        
        BarajaServicio bs = new BarajaServicio();
                bs.crearBaraja();
                bs.barajar();
                bs.siguienteCarta();
                bs.cartasDisponibles();
                bs.darCartas();
                bs.cartasMonton();
    }
    
}
