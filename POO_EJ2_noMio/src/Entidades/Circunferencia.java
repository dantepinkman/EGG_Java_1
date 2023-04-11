
package Entidades;

import java.util.Scanner;


public class Circunferencia {
    
   
    private float radio;
    private float area;
    private float perimetro;

    
    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(float radio) {        
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    public void area(float radio){
        area = (float) (radio*radio*Math.PI) ;
    }
    
    public void perimetro(float radio){
        perimetro = (float) (radio*2*Math.PI) ;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }
    
    
    
}
