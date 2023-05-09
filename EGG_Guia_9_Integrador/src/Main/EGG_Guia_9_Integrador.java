
package Main;

import Servicios.EstudiantesServicio;

public class EGG_Guia_9_Integrador {

    public static void main(String[] args) {
        
        EstudiantesServicio es = new EstudiantesServicio();
        
        for (int i = 2; i <= 128; i*=2) {
            System.out.println("i " + i);
        }
        
        es.agregarEstudiante();
        es.mostrarEstudiante();
        es.promedioNotas();
        
    }
    
}
