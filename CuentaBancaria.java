/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frankix.tareahilosconcurrencia;

/**
 *
 * @author LENOVO
 */
public class CuentaBancaria {
    private int saldo = 1000;

    public synchronized void retirarDinero(String nombrePersona, int cantidad) {
        if (saldo >= cantidad) {
            System.out.println(nombrePersona + " está revisando el saldo... hay suficiente.");
            try { 
                Thread.sleep(500); 
            } catch (Exception e) {}
            
            saldo = saldo - cantidad;
            System.out.println(nombrePersona + " retiró $" + cantidad + ". Saldo restante: $" + saldo);
        } else {
            System.out.println("Lo siento " + nombrePersona + ", no hay saldo suficiente. Saldo actual: $" + saldo);
        }
    }
}

