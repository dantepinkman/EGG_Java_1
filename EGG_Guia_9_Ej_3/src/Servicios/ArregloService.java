package Servicios;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArregloService {

    public void inicializarA(double[] ArregloA) {

        for (int i = 0; i < 50; i++) {

            ArregloA[i] = Math.random() * 100;

        }

    }

    public void mostrar(double[] ArregloA) {

        for (int i = 0; i < 50; i++) {
            //System.out.println(ArregloA[i]);
        }

    }

    public void ordenar(double[] ArregloA) {

        //Arrays.sort(arreglo1, Collections.reverseOrder()); 
        double[] aux = new double[50];

        Arrays.sort(ArregloA);

        for (int i = 0; i < 50; i++) {
            aux[i] = ArregloA[49 - i];
        }

        System.arraycopy(aux, 0, ArregloA, 0, 50);
        //System.out.println(ArregloA[i]);
    }

    public void inizializarB(double[] ArregloA, double[] ArregloB) {

        System.arraycopy(ArregloA, 0, ArregloB, 0, 10); 
        
        Arrays.fill(ArregloB, 10, 20, 0.5);

    }

    public void mostrarAyB(double[] ArregloA, double[] ArregloB) {

        for (int i = 0; i < 50; i++) {
            System.out.println(ArregloA[i]);
        }
        System.out.println("-----------------------------");
        for (int i = 0; i < 20; i++) {
            System.out.println(ArregloB[i]);
        }
    }

}
