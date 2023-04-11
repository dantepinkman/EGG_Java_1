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
    private int vueltas;

    private int energia;

    public Mascota() {
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int nacimiento, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.nacimiento = nacimiento;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
        this.vueltas = 2;
    }

    public Mascota(String nombre, String color, int nacimiento, boolean cola) {
        this.tipo = tipo;
        this.color = color;
        this.nacimiento = nacimiento;
        this.cola = cola;

        this.energia = 1000;

    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    
    /**
     * Funcion energiaRestar
     * 
     * @param energiaRestar
     * @return energia
     */
    
    public int pasear(int energiaRestar) {

        energia = energia - energiaRestar;
        //energia -= energiaRestar;
        return energia;

    }

    /**
     * funcion destinada a pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    
    public int pasear(int energiaRestar, int vueltas) {

        for (int i = 0; i < vueltas; i++) {
            energia = energia - energiaRestar;
        }
        return energia;

    }

    @Override

    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", nacimiento=" + nacimiento + ", cola=" + cola + ", raza=" + raza + ", vueltas=" + vueltas + ", energia=" + energia + '}';
    }

    
    
   

}
