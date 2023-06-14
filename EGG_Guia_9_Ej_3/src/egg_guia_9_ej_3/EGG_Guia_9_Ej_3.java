package egg_guia_9_ej_3;

import Servicios.ArregloService;

public class EGG_Guia_9_Ej_3 {

    public static void main(String[] args) {

        double[] VectorA = new double[50];
        double[] VectorB = new double[20];

        
        ArregloService A = new ArregloService();
       
        A.inicializarA(VectorA);
        A.mostrar(VectorA);
        A.ordenar(VectorA);
        A.inizializarB(VectorA, VectorB);
        A.mostrarAyB(VectorA, VectorB);
        
    }

}
