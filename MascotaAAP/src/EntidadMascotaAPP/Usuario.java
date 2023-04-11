package EntidadMascotaAPP;

import java.util.Date;

public class Usuario {

    public String nombre;
    public String apellido;
    public String DNI;
    public Date nacimiento;
    public String pais;

    public Usuario(String nombre, String apellido, String DNI, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

    public Usuario() {
    }
    
    

}
