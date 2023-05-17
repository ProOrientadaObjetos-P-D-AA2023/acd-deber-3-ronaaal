/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema1;

/**
 *
 * @author PC
 */
public class Descuento {
    
    private double precio;
    private int cantidad;
    
    public Descuento (double preci, int canti) {
        precio = preci;
        cantidad = canti;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double pre) {
        precio = pre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int can) {
        cantidad = can;
    }
    
    public double calcularDescuento() {
        if (precio >= 1000 && cantidad >= 10) {
            return 10.0;
        } else {
            return 5.0;
        }
    }

    public double calcularPrecioFinal() {
        double descuento = calcularDescuento();
        double descuentoDecimal = descuento / 100.0;
        return precio - (precio * descuentoDecimal);
    }
}

