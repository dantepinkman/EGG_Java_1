package Main;

import Entities.Cafeteria;
import Services.CafeteriaServices;

public class Main {

    public static void main(String[] args) {

        CafeteriaServices caf = new CafeteriaServices();
        Cafeteria C1 = caf.crearCafetera();

        caf.llenarCafetera(C1);
        System.out.println("Ahora su taza tiene " + caf.servirTaza(C1));
        caf.vaciarCafetera(C1);
        caf.agregarCafe(C1);
    }

}
