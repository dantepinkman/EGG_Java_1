
package egg_guia_9_ej_4;

import Servicios.FechaService;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EGG_Guia_9_Ej_4 {
    
    public static void main(String[] args) {
     
        FechaService F = new FechaService();
        
        Date nacimiento = F.fechaNacimiento();
        Date actual = F.fechaActual();
        int anios = F.diferencia(actual, nacimiento);
        
        System.out.println("Su fecha de nacimiento es " + new SimpleDateFormat("yyyy,mm,dd").format(nacimiento));
        System.out.println(actual);   //sin cambiar a formato simple
        System.out.println("Su edad acual en años es " + anios);
        
    }
    
}
