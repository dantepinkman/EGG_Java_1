package Main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CuentaBancariaServicio cs1 = new CuentaBancariaServicio();
        CuentaBancaria cb1 = cs1.crearCuenta();

        do {            
          System.out.println("Que desea hacer:"
                + "\n1-Retirar"
                + "\n2-Extraccion Rapida"
                + "\n3-Ingresar Saldo"
                + "\n4-Consultar Saldo"
                + "\n5-Consultar Datos");

        int respuesta = leer.nextInt();

        switch (respuesta) {
            case 1:
                cs1.retirar();
                break;
            case 2:
                cs1.ExraccionRapida();
                break;
            case 3:
                cs1.ingresar();
                break;
            case 4:
                cs1.Consultar();
                break;
            case 5:
                cs1.ConsultarDatos();
                break;
            default:
                throw new AssertionError();
        }  
        } while (true);
        
        

        //System.out.flush();
    }

}
