
package Entidades;

public class Circunferencia {
    
    private double radio;
    private double circunferencia;
    private double perimetro;

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Circunferencia(double circunferencia, double perimetro) {
        this.circunferencia = circunferencia;
        this.perimetro = perimetro;
    }

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
