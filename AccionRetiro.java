package com.frankix.tareahilosconcurrencia;

public class AccionRetiro implements Runnable {
    private CuentaBancaria cuenta;
    private String nombre;

    public AccionRetiro(CuentaBancaria cuentaCompartida, String nombrePersona) {
        this.cuenta = cuentaCompartida;
        this.nombre = nombrePersona;
    }

    @Override
    public void run() {
        cuenta.retirarDinero(nombre, 600);
    }
}
