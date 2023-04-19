
package Entidades;

public class CuentaBancaria {
private int numeroCuenta;
private long dni;
private double saldo;
private double nuevoSaldo;
private double retirar;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double nuevoSaldo, double retirar) {
        this.nuevoSaldo = nuevoSaldo;
        this.retirar = retirar;
    }

    public CuentaBancaria(int numeroCuenta, long dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public double getNuevoSaldo() {
        return nuevoSaldo;
    }

    public void setNuevoSaldo(double nuevoSaldo) {
        this.nuevoSaldo = nuevoSaldo;
    }



}

