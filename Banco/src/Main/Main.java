package Main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

public class Main {

    public static void main(String[] args) {
        
        
        CuentaBancariaServicio cs1 = new CuentaBancariaServicio();
        CuentaBancaria cb1 = cs1.crearCuenta();
        
        cs1.ingresar();
        
        //System.out.flush();
    }

}
