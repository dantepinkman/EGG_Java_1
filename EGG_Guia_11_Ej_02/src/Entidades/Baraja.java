
package Entidades;

import java.util.ArrayList;


public class Baraja {
    
    private ArrayList<Carta> baraja = new ArrayList();
    private ArrayList<Carta> monton = new ArrayList();

    public Baraja(ArrayList<Carta> baraja,ArrayList<Carta> monton) {
        this.baraja = baraja;
        this.monton = monton;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public Baraja() {
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }
    
    
    
}
