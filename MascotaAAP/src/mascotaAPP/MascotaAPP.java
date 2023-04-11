package mascotaAPP;

import EntidadMascotaAPP.Mascota;
import java.util.Scanner;

public class MascotaAPP {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Mascota m1 = new Mascota("pepe", leer.next(), 0, true);

        m1.setNombre("caca");
        
        m1.pasear(100);

        System.out.println(m1);

    }
}
