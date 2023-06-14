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
        
        // System.out.println("Ingrese Saldo");
        // c1.setSaldo(leer.nextDouble());
        
        return c1;
    }

    public CuentaBancaria ingresar() {

        Double NuevoSaldo;

        System.out.println("Acreditar Saldo");
        NuevoSaldo = leer.nextDouble();

        NuevoSaldo += c1.getSaldo();

        c1.setSaldo(NuevoSaldo);

        System.out.println("Su nuevo Saldo: " + c1.getSaldo());

        return c1;

    }

    public CuentaBancaria retirar() {
        Double Retirar;
        Double Actual;

        System.out.println("Cuanto desea Retirar");
        Retirar = leer.nextDouble();

        Actual = c1.getSaldo();

        if (Actual >= Retirar) {
            Actual -= Retirar;
        } else {
            System.out.println("Saldo insuficiente, ud solo puede retirar " + Actual);
            Retirar = Actual;
            Actual = 0.0;
        }

        c1.setSaldo(Actual);
        System.out.println("Ud a retirado: " + Retirar + ", Su nuevo saldo es: " + c1.getSaldo());
        return c1;
    }

    public CuentaBancaria ExraccionRapida() {
        Double Retirar;
        Double Actual;
        System.out.println("Extraccion Rapida, solo puede retirar el 20%");
        Retirar = leer.nextDouble();
        Actual = c1.getSaldo();

        if (Retirar <= (Actual * 0.2)) {
            Actual -= Retirar;
        } else {
            System.out.println("solo puede Retirar el 20%, se retirará " + (Actual * .2));
            Retirar = Actual * 0.2;
            Actual -= (Actual * 0.2);

        }
        c1.setSaldo(Actual);
        System.out.println("Ud a retirado: " + Retirar + " Su saldo ahora es de " + Actual);
        return c1;
    }

    public CuentaBancaria Consultar() {
        System.out.println("Su saldo es de " + c1.getSaldo());
        return c1;
    }

    public CuentaBancaria ConsultarDatos() {
        System.out.println("Sus datos son: "
                + "\nDNI: " + c1.getDni()
                + "\nNro de cuenta: " + c1.getNumeroCuenta());
        return c1;
    }

}
