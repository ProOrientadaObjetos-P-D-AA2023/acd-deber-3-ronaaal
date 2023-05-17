/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema1;

import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Problema1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el número de productos: ");
        int cantidad = scanner.nextInt();

        Descuento tiendita = new Descuento (precio, cantidad);
        
        System.out.println("El descuento es de: " + tiendita.calcularDescuento() + "%");
        System.out.println("Precio final: " + tiendita.calcularPrecioFinal()+ "$");
    }
}

