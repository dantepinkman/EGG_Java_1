package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosServicios {

    public ParDeNumeros MostrarValores() {
        ParDeNumeros PA = new ParDeNumeros();
        System.out.println(PA.getNum1() + " " + PA.getNum2());
        return PA;

    }

    public double devolverMayor(ParDeNumeros PA) {

        return Math.max(PA.getNum1(), PA.getNum2());

    }

    public void calcularPotencia(ParDeNumeros PA) {

        ParDeNumeros P = PA;

        double mayor = devolverMayor(P);
        mayor = Math.round(mayor);
        
        double num1 = Math.round(PA.getNum1());
        double num2 = Math.round(PA.getNum2());

        if (mayor == num1) {

            System.out.println(Math.pow(mayor, num2));

        } else {

            System.out.println(Math.pow(num2, mayor));
        }

    }
    
    public void calcularRaiz(ParDeNumeros PA) {

        ParDeNumeros P = PA;

        double mayor = devolverMayor(P);
        mayor = Math.round(mayor);
        
        double num1 = Math.round(PA.getNum1());
        double num2 = Math.round(PA.getNum2());

        if (mayor == num1) {

            System.out.println(Math.sqrt(num2));

        } else {

            System.out.println(Math.sqrt(mayor));
        }

    }
    

}
