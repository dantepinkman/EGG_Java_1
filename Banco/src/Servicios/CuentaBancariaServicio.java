package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
 CuentaBancaria c1 = new CuentaBancaria();
 
    public CuentaBancaria crearCuenta() {
       
        
        System.out.println("Ingrese el DNI");
        c1.setDni(leer.nextLong());
        System.out.println("Ingrese numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese Saldo");
        c1.setSaldo(leer.nextDouble());
        return c1;
    }
    
    public CuentaBancaria ingresar(){
        
       
        Double NuevoSaldo;
        
        System.out.println("Acreditar Saldo");
        NuevoSaldo = leer.nextDouble();
     
        NuevoSaldo += c1.getSaldo();
        
        c1.setSaldo(NuevoSaldo);
        
        System.out.println("Su nevo Saldo: " + c1.getSaldo());
        
        return c1;
        
        }
    
    public CuentaBancaria retirar(){
        Double Retirar;
        
        System.out.println("Cuanto desea Retirar");
        Retirar = leer.nextDouble();
        
        Retirar -= c1.getSaldo();
        c1.setSaldo(Retirar);
        
        return c1;
    }
    
    
    
    
    
}
