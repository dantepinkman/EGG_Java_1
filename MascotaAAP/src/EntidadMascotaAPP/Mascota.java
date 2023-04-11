
package EntidadMascotaAPP;

import java.util.Date;

public class Mascota {
    
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private int nacimiento;
    private boolean cola;
    private String raza;
    
    public Mascota (){
        
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int nacimiento, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.nacimiento = nacimiento;
        this.cola = cola;
        this.raza = raza;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
        //if (nombre.length(()>0)){
            
        //}
    }
    
    
}
