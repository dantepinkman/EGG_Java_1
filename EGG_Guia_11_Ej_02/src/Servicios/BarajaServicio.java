package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Baraja ba = new Baraja();
    
    public void crearBaraja() {

        int[] numero = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        String[] palo = {"Espada","Basto","Oro","Copa"};
        
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < palo.length; j++) {
                Carta carta = new Carta(numero[i],palo[j]);
                
                ba.getBaraja().add(carta);
            }
        }
        System.out.println("Las cartan son: " + ba.getBaraja());
        //return ba.getBaraja();
    }
    
    public void barajar() {     //Pm mas TAB
        Collections.shuffle(ba.getBaraja());
        System.out.println("Las cartan son: " + ba.getBaraja());
        
    }
    
    public void siguienteCarta() {
        
        if (ba.getBaraja().size() > 0) {
             ba.getMonton().add(ba.getBaraja().get(0));
        ba.getBaraja().remove(0);
        }else{
            System.out.println("Ya no quedan mas cartas.");
        }
       
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan disponibles " + ba.getBaraja().size() + " Cartas.");
        System.out.println("Las cartan son: " + ba.getBaraja());
        if (ba.getBaraja().size() == 0){
            System.out.println("No quedan mas cartas.");
        }
    }
    
    public void darCartas(){
        System.out.println("Cuantas cartas pide?");
        int cantidad = leer.nextInt();
        int suma = 0;
        
        if (cantidad <= ba.getBaraja().size()) {
            do {
                ba.getMonton().add(ba.getBaraja().get(0));
                ba.getBaraja().remove(0);
                suma ++;
            } while (suma < cantidad);
            System.out.println("Ud a pedido " + cantidad + " Cartas.");
        }else{
            System.out.println("No hay Suficientes cartas. Quedan solo " + ba.getBaraja().size() + " Cartas.");
        }
    }
    
    public void cartasMonton(){
        System.out.println("Las cartas del monton son: " + ba.getMonton());
    }
    
    
    
    
    
    
    
    
    
    
    
    

}
