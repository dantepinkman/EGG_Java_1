package Services;

import Entities.Cafeteria;
import java.util.Scanner;

public class CafeteriaServices {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafeteria crearCafetera() {
        System.out.println("Cual es la capacidad maxima de tu cafetera?");
        int capacidadMaxima = leer.nextInt();

        System.out.println("Cual es la cantidad actual de tu cafetera?");
        int cantidadActual = leer.nextInt();
        

        return new Cafeteria(capacidadMaxima, cantidadActual);
    }

    public void llenarCafetera(Cafeteria llenar) {
        llenar.setCantidadActual(llenar.getCapacidadMaxima());
    }

    public int servirTaza(Cafeteria llenar) {
        System.out.println("Cual es la capacidad de la taza?");
        int taza = leer.nextInt();

        if (llenar.getCantidadActual() >= taza) {
            llenar.setCantidadActual(llenar.getCantidadActual() - taza);
        } else {
            taza = llenar.getCantidadActual();
            llenar.setCantidadActual(0);
        }
        return taza;
    }

    public void vaciarCafetera(Cafeteria vaciar) {
        System.out.println("Desea Vaciar la cafetera?");
        String respuesta = leer.next().toLowerCase();
        if ("si".equals(respuesta)) {
            vaciar.setCantidadActual(0);
        }
    }

    public void agregarCafe(Cafeteria agregar) {
        System.out.println("Cuanto cafe desea agregar?");
        agregar.setCantidadActual(leer.nextInt());
    }

}
