/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema2;

/**
 *
 * @author Ronal
 */
public class Empleado {
    private String nombre;
    private double salario;
    private int edad;

    public Empleado(String nom, double sal, int eda) {
        nombre = nom;
        salario = sal;
        edad = eda;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Salario: $" + salario + ", Edad: " + edad;
    }
}
