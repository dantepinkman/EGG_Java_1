
package Entidades;


public class Cadena {
    
    private String frase;
    private int longFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        
        this.frase = frase;
        this.longFrase = frase.length();
        
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }
    
    
    
    
}
