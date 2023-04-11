
package mascotaAPP;

import EntidadMascotaAPP.Mascota;
import java.util.Scanner;


public class MascotaAPP {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese nombre");
        Mascota m1 = new Mascota("Chiquito", leer.next(), "feo", "Amarillo", 0, true, "perro");
        System.out.println(m1.apodo + " " + m1.nombre+" "+m1.tipo);
        
        m1.
        
    }
}
