package egg_guia_9_ej_1;

import Entidades.Cadena;
import Servicios.CadenaServicios;

public class EGG_Guia_9_Ej_1 {

    public static void main(String[] args) {

        CadenaServicios CadS = new CadenaServicios();
        Cadena Cad = new Cadena("HolaMundo");
        
        CadS.mostrarVocales(Cad);
        CadS.invertirFrase(Cad);
        CadS.vecesRepetido(Cad);
        CadS.compararLongitud(Cad);
        CadS.unirFrases(Cad);
        CadS.reemplazar(Cad);
        CadS.contiene(Cad);

    }

}
