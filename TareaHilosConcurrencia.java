package com.frankix.tareahilosconcurrencia;

public class TareaHilosConcurrencia {

    public static void main(String[] args) {
        CuentaBancaria cuentaCompartida = new CuentaBancaria();

        AccionRetiro accionFranklin = new AccionRetiro(cuentaCompartida, "Franklin");
        AccionRetiro accionLiliana = new AccionRetiro(cuentaCompartida, "Liliana");

        Thread hilo1 = new Thread(accionFranklin);
        Thread hilo2 = new Thread(accionLiliana);

        System.out.println("--- INICIANDO LOS RETIROS AL TIEMPO ---");
        hilo1.start();
        hilo2.start();
    }
}

